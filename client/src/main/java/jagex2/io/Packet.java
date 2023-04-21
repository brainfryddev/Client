package jagex2.io;

import jagex2.client.Signlink;
import jagex2.datastruct.Hashable;
import jagex2.datastruct.LinkList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.math.BigInteger;

// Packet: Buffer for reading and writing data
@OriginalClass("client!kb")
public final class Packet extends Hashable {

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "[I")
	public static final int[] anIntArray191 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
	@OriginalMember(owner = "client!kb", name = "z", descriptor = "Lclient!ob;")
	public static final LinkList aClass28_6 = new LinkList(0);
	@OriginalMember(owner = "client!kb", name = "A", descriptor = "Lclient!ob;")
	public static final LinkList aClass28_7 = new LinkList(0);
	@OriginalMember(owner = "client!kb", name = "B", descriptor = "Lclient!ob;")
	public static final LinkList aClass28_8 = new LinkList(0);
	@OriginalMember(owner = "client!kb", name = "t", descriptor = "[I")
	private static final int[] anIntArray190 = new int[256];
	@OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
	public static int anInt563;
	@OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
	public static int anInt564;
	@OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
	public static int anInt565;
	@OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
	public static int anInt556 = 40946;
	@OriginalMember(owner = "client!kb", name = "o", descriptor = "Z")
	public static boolean aBoolean129 = true;

	@OriginalMember(owner = "client!kb", name = "q", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
	public int anInt561;

	@OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
	public int anInt562;

	@OriginalMember(owner = "client!kb", name = "v", descriptor = "Lclient!tb;")
	public Isaac aClass38_2;

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "B")
	private final byte aByte29 = -34;

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "B")
	private final byte aByte30 = -106;

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
	private final int anInt557 = 3;

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
	private int anInt558 = -506;

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "Z")
	private boolean aBoolean128 = true;

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
	private final int anInt559 = 4277;

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
	private final int anInt560 = -178;

	static {
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			@Pc(11) int local11 = local8;
			for (@Pc(13) int local13 = 0; local13 < 8; local13++) {
				if ((local11 & 0x1) == 1) {
					local11 = local11 >>> 1 ^ 0xEDB88320;
				} else {
					local11 >>>= 0x1;
				}
			}
			anIntArray190[local8] = local11;
		}
	}

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(I)V")
	public Packet(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 40946) {
				aBoolean129 = !aBoolean129;
			}
		} catch (@Pc(33) RuntimeException local33) {
			Signlink.reporterror("73559, " + arg0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(I[B)V")
	public Packet(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.aByteArray7 = arg1;
			this.anInt561 = 0;
			@Pc(32) int local32 = 15 / arg0;
		} catch (@Pc(34) RuntimeException local34) {
			Signlink.reporterror("63917, " + arg0 + ", " + arg1 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)Lclient!kb;")
	public static Packet method378(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) LinkList local3 = aClass28_7;
			synchronized (aClass28_7) {
				@Pc(7) Packet local7 = null;
				if (arg0 == 0 && anInt563 > 0) {
					anInt563--;
					local7 = (Packet) aClass28_6.method455();
				} else if (arg0 == 1 && anInt564 > 0) {
					anInt564--;
					local7 = (Packet) aClass28_7.method455();
				} else if (arg0 == 2 && anInt565 > 0) {
					anInt565--;
					local7 = (Packet) aClass28_8.method455();
				}
				if (local7 != null) {
					local7.anInt561 = 0;
					return local7;
				}
			}
			if (arg1 >= 0) {
				aBoolean129 = !aBoolean129;
			}
			@Pc(77) Packet local77 = new Packet(anInt556);
			local77.anInt561 = 0;
			if (arg0 == 0) {
				local77.aByteArray7 = new byte[100];
			} else if (arg0 == 1) {
				local77.aByteArray7 = new byte[5000];
			} else {
				local77.aByteArray7 = new byte[30000];
			}
			return local77;
		} catch (@Pc(104) RuntimeException local104) {
			Signlink.reporterror("65959, " + arg0 + ", " + arg1 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	public void method379(@OriginalArg(0) byte arg0) {
		try {
			@Pc(1) LinkList local1 = aClass28_7;
			synchronized (aClass28_7) {
				this.anInt561 = 0;
				if (this.aByteArray7.length == 100 && anInt563 < 1000) {
					aClass28_6.method453(this);
					anInt563++;
					return;
				}
				if (this.aByteArray7.length == 5000 && anInt564 < 250) {
					aClass28_7.method453(this);
					anInt564++;
					return;
				}
				if (this.aByteArray7.length == 30000 && anInt565 < 50) {
					aClass28_8.method453(this);
					anInt565++;
					return;
				}
			}
			if (arg0 != 8) {
				anInt556 = -173;
			}
		} catch (@Pc(73) RuntimeException local73) {
			Signlink.reporterror("53281, " + arg0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)V")
	public void method380(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray7[this.anInt561++] = (byte) (arg1 + this.aClass38_2.method532());
			if (arg0 != this.aByte29) {
				aBoolean129 = !aBoolean129;
			}
		} catch (@Pc(27) RuntimeException local27) {
			Signlink.reporterror("36381, " + arg0 + ", " + arg1 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	public void method381(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt561++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
	public void method382(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt561++] = (byte) (arg0 >> 8);
		this.aByteArray7[this.anInt561++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZI)V")
	public void method383(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			if (!arg0) {
				aBoolean129 = !aBoolean129;
			}
			this.aByteArray7[this.anInt561++] = (byte) arg1;
			this.aByteArray7[this.anInt561++] = (byte) (arg1 >> 8);
		} catch (@Pc(35) RuntimeException local35) {
			Signlink.reporterror("76445, " + arg0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
	public void method384(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt561++] = (byte) (arg0 >> 16);
		this.aByteArray7[this.anInt561++] = (byte) (arg0 >> 8);
		this.aByteArray7[this.anInt561++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)V")
	public void method385(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt561++] = (byte) (arg0 >> 24);
		this.aByteArray7[this.anInt561++] = (byte) (arg0 >> 16);
		this.aByteArray7[this.anInt561++] = (byte) (arg0 >> 8);
		this.aByteArray7[this.anInt561++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(ZI)V")
	public void method386(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray7[this.anInt561++] = (byte) arg1;
			this.aByteArray7[this.anInt561++] = (byte) (arg1 >> 8);
			this.aByteArray7[this.anInt561++] = (byte) (arg1 >> 16);
			if (!arg0) {
				this.aByteArray7[this.anInt561++] = (byte) (arg1 >> 24);
			}
		} catch (@Pc(58) RuntimeException local58) {
			Signlink.reporterror("60396, " + arg0 + ", " + arg1 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZJ)V")
	public void method387(@OriginalArg(0) boolean arg0, @OriginalArg(1) long arg1) {
		try {
			this.aByteArray7[this.anInt561++] = (byte) (arg1 >> 56);
			this.aByteArray7[this.anInt561++] = (byte) (arg1 >> 48);
			this.aByteArray7[this.anInt561++] = (byte) (arg1 >> 40);
			this.aByteArray7[this.anInt561++] = (byte) (arg1 >> 32);
			this.aByteArray7[this.anInt561++] = (byte) (arg1 >> 24);
			this.aByteArray7[this.anInt561++] = (byte) (arg1 >> 16);
			this.aByteArray7[this.anInt561++] = (byte) (arg1 >> 8);
			if (arg0) {
				this.aByteArray7[this.anInt561++] = (byte) arg1;
			}
		} catch (@Pc(131) RuntimeException local131) {
			Signlink.reporterror("23917, " + arg0 + ", " + arg1 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method388(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray7, this.anInt561);
		this.anInt561 += arg0.length();
		this.aByteArray7[this.anInt561++] = 10;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([BIIB)V")
	public void method389(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		try {
			@Pc(7) int local7;
			if (arg3 != this.aByte30) {
				for (local7 = 1; local7 > 0; local7++) {
				}
			}
			for (local7 = arg2; local7 < arg2 + arg1; local7++) {
				this.aByteArray7[this.anInt561++] = arg0[local7];
			}
		} catch (@Pc(37) RuntimeException local37) {
			Signlink.reporterror("88471, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)V")
	public void method390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 != 0) {
				aBoolean129 = !aBoolean129;
			}
			this.aByteArray7[this.anInt561 - arg1 - 1] = (byte) arg1;
		} catch (@Pc(20) RuntimeException local20) {
			Signlink.reporterror("44726, " + arg0 + ", " + arg1 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "()I")
	public int method391() {
		return this.aByteArray7[this.anInt561++] & 0xFF;
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "()B")
	public byte method392() {
		return this.aByteArray7[this.anInt561++];
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "()I")
	public int method393() {
		this.anInt561 += 2;
		return ((this.aByteArray7[this.anInt561 - 2] & 0xFF) << 8) + (this.aByteArray7[this.anInt561 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "()I")
	public int method394() {
		this.anInt561 += 2;
		@Pc(27) int local27 = ((this.aByteArray7[this.anInt561 - 2] & 0xFF) << 8) + (this.aByteArray7[this.anInt561 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "()I")
	public int method395() {
		this.anInt561 += 3;
		return ((this.aByteArray7[this.anInt561 - 3] & 0xFF) << 16) + ((this.aByteArray7[this.anInt561 - 2] & 0xFF) << 8) + (this.aByteArray7[this.anInt561 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "()I")
	public int method396() {
		this.anInt561 += 4;
		return ((this.aByteArray7[this.anInt561 - 4] & 0xFF) << 24) + ((this.aByteArray7[this.anInt561 - 3] & 0xFF) << 16) + ((this.aByteArray7[this.anInt561 - 2] & 0xFF) << 8) + (this.aByteArray7[this.anInt561 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "(I)J")
	public long method397(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) long local5 = (long) this.method396() & 0xFFFFFFFFL;
			@Pc(9) int local9 = 87 / arg0;
			@Pc(15) long local15 = (long) this.method396() & 0xFFFFFFFFL;
			return (local5 << 32) + local15;
		} catch (@Pc(22) RuntimeException local22) {
			Signlink.reporterror("61408, " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "()Ljava/lang/String;")
	public String method398() {
		@Pc(2) int local2 = this.anInt561;
		while (this.aByteArray7[this.anInt561++] != 10) {
		}
		return new String(this.aByteArray7, local2, this.anInt561 - local2 - 1);
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)[B")
	public byte[] method399(@OriginalArg(0) byte arg0) {
		try {
			@Pc(2) int local2 = this.anInt561;
			if (arg0 != 31) {
				throw new NullPointerException();
			}
			while (this.aByteArray7[this.anInt561++] != 10) {
			}
			@Pc(29) byte[] local29 = new byte[this.anInt561 - local2 - 1];
			for (@Pc(31) int local31 = local2; local31 < this.anInt561 - 1; local31++) {
				local29[local31 - local2] = this.aByteArray7[local31];
			}
			return local29;
		} catch (@Pc(52) RuntimeException local52) {
			Signlink.reporterror("66822, " + arg0 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(III[B)V")
	public void method400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		try {
			if (arg1 >= 0) {
				this.anInt558 = -432;
			}
			for (@Pc(6) int local6 = arg2; local6 < arg2 + arg0; local6++) {
				arg3[local6] = this.aByteArray7[this.anInt561++];
			}
		} catch (@Pc(29) RuntimeException local29) {
			Signlink.reporterror("61364, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "(I)V")
	public void method401(@OriginalArg(0) int arg0) {
		try {
			this.anInt562 = this.anInt561 * 8;
			if (arg0 <= 0) {
				this.aBoolean128 = !this.aBoolean128;
			}
		} catch (@Pc(17) RuntimeException local17) {
			Signlink.reporterror("5633, " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(II)I")
	public int method402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 < 9 || arg0 > 9) {
				return this.anInt557;
			}
			@Pc(15) int local15 = this.anInt562 >> 3;
			@Pc(22) int local22 = 8 - (this.anInt562 & 0x7);
			@Pc(24) int local24 = 0;
			this.anInt562 += arg1;
			while (arg1 > local22) {
				local24 += (this.aByteArray7[local15++] & anIntArray191[local22]) << arg1 - local22;
				arg1 -= local22;
				local22 = 8;
			}
			if (arg1 == local22) {
				local24 += this.aByteArray7[local15] & anIntArray191[local22];
			} else {
				local24 += this.aByteArray7[local15] >> local22 - arg1 & anIntArray191[arg1];
			}
			return local24;
		} catch (@Pc(91) RuntimeException local91) {
			Signlink.reporterror("91100, " + arg0 + ", " + arg1 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "(I)V")
	public void method403(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != this.anInt559) {
				for (@Pc(5) int local5 = 1; local5 > 0; local5++) {
				}
			}
			this.anInt561 = (this.anInt562 + 7) / 8;
		} catch (@Pc(20) RuntimeException local20) {
			Signlink.reporterror("27753, " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "()I")
	public int method404() {
		@Pc(7) int local7 = this.aByteArray7[this.anInt561] & 0xFF;
		return local7 < 128 ? this.method391() - 64 : this.method393() - 49152;
	}

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "()I")
	public int method405() {
		@Pc(7) int local7 = this.aByteArray7[this.anInt561] & 0xFF;
		return local7 < 128 ? this.method391() : this.method393() - 32768;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public void method406(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(2) int local2 = this.anInt561;
			this.anInt561 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method400(local2, -110, 0, local8);
			@Pc(19) BigInteger local19 = new BigInteger(local8);
			@Pc(24) BigInteger local24 = local19.modPow(arg1, arg0);
			@Pc(27) byte[] local27 = local24.toByteArray();
			this.anInt561 = 0;
			if (arg2 == 24676) {
				this.method381(local27.length);
				this.method389(local27, local27.length, 0, (byte) -106);
			}
		} catch (@Pc(47) RuntimeException local47) {
			Signlink.reporterror("7102, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}
}
