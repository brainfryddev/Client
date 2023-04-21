import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!yb")
public final class Wave {

	@OriginalMember(owner = "client!yb", name = "d", descriptor = "[I")
	public static final int[] anIntArray231 = new int[1000];
	@OriginalMember(owner = "client!yb", name = "c", descriptor = "[Lclient!yb;")
	private static final Wave[] aClass43Array1 = new Wave[1000];
	@OriginalMember(owner = "client!yb", name = "e", descriptor = "[B")
	public static byte[] aByteArray15;
	@OriginalMember(owner = "client!yb", name = "f", descriptor = "Lclient!kb;")
	public static Packet aClass1_Sub3_Sub3_23;
	@OriginalMember(owner = "client!yb", name = "b", descriptor = "I")
	public static int anInt877 = 473;
	@OriginalMember(owner = "client!yb", name = "h", descriptor = "I")
	private int anInt878;

	@OriginalMember(owner = "client!yb", name = "i", descriptor = "I")
	private int anInt879;

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "Z")
	private final boolean aBoolean158 = true;

	@OriginalMember(owner = "client!yb", name = "g", descriptor = "[Lclient!zb;")
	private final WaveTone[] aClass44Array1 = new WaveTone[10];

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(Lclient!kb;I)V")
	public static void method561(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		try {
			aByteArray15 = new byte[441000];
			aClass1_Sub3_Sub3_23 = new Packet(363, aByteArray15);
			@Pc(12) int local12 = 87 / arg1;
			WaveTone.method575();
			while (true) {
				@Pc(16) int local16 = arg0.method393();
				if (local16 == 65535) {
					return;
				}
				aClass43Array1[local16] = new Wave();
				aClass43Array1[local16].method563(false, arg0);
				anIntArray231[local16] = aClass43Array1[local16].method564((byte) 7);
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("6214, " + arg0 + ", " + arg1 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(BII)Lclient!kb;")
	public static Packet method562(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg0 != -16) {
				anInt877 = -83;
			}
			if (aClass43Array1[arg2] == null) {
				return null;
			} else {
				@Pc(12) Wave local12 = aClass43Array1[arg2];
				return local12.method565(true, arg1);
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("72905, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(ZLclient!kb;)V")
	public void method563(@OriginalArg(0) boolean arg0, @OriginalArg(1) Packet arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
				@Pc(6) int local6 = arg1.method391();
				if (local6 != 0) {
					arg1.anInt561--;
					this.aClass44Array1[local1] = new WaveTone();
					this.aClass44Array1[local1].method578(false, arg1);
				}
			}
			if (arg0) {
				anInt877 = -307;
			}
			this.anInt878 = arg1.method393();
			this.anInt879 = arg1.method393();
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("58220, " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(B)I")
	public int method564(@OriginalArg(0) byte arg0) {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
				if (this.aClass44Array1[local5] != null && this.aClass44Array1[local5].anInt948 / 20 < local3) {
					local3 = this.aClass44Array1[local5].anInt948 / 20;
				}
			}
			if (arg0 == 7) {
				@Pc(38) boolean local38 = false;
			} else {
				anInt877 = -8;
			}
			if (this.anInt878 < this.anInt879 && this.anInt878 / 20 < local3) {
				local3 = this.anInt878 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(67) int local67 = 0; local67 < 10; local67++) {
				if (this.aClass44Array1[local67] != null) {
					this.aClass44Array1[local67].anInt948 -= local3 * 20;
				}
			}
			if (this.anInt878 < this.anInt879) {
				this.anInt878 -= local3 * 20;
				this.anInt879 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("49328, " + arg0 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(ZI)Lclient!kb;")
	public Packet method565(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) int local3 = this.method566(arg1);
			aClass1_Sub3_Sub3_23.anInt561 = 0;
			aClass1_Sub3_Sub3_23.method385(1380533830);
			aClass1_Sub3_Sub3_23.method386(false, local3 + 36);
			aClass1_Sub3_Sub3_23.method385(1463899717);
			aClass1_Sub3_Sub3_23.method385(1718449184);
			aClass1_Sub3_Sub3_23.method386(false, 16);
			if (!arg0) {
				for (@Pc(29) int local29 = 1; local29 > 0; local29++) {
				}
			}
			aClass1_Sub3_Sub3_23.method383(this.aBoolean158, 1);
			aClass1_Sub3_Sub3_23.method383(this.aBoolean158, 1);
			aClass1_Sub3_Sub3_23.method386(false, 22050);
			aClass1_Sub3_Sub3_23.method386(false, 22050);
			aClass1_Sub3_Sub3_23.method383(this.aBoolean158, 1);
			aClass1_Sub3_Sub3_23.method383(this.aBoolean158, 8);
			aClass1_Sub3_Sub3_23.method385(1684108385);
			aClass1_Sub3_Sub3_23.method386(false, local3);
			aClass1_Sub3_Sub3_23.anInt561 += local3;
			return aClass1_Sub3_Sub3_23;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("83597, " + arg0 + ", " + arg1 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(I)I")
	private int method566(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass44Array1[local5] != null && this.aClass44Array1[local5].anInt947 + this.aClass44Array1[local5].anInt948 > local3) {
				local3 = this.aClass44Array1[local5].anInt947 + this.aClass44Array1[local5].anInt948;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt878 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt879 * 22050 / 1000;
		if (local58 < 0 || local58 > local51 || local65 < 0 || local65 > local51 || local58 >= local65) {
			arg0 = 0;
		}
		@Pc(90) int local90 = local51 + (local65 - local58) * (arg0 - 1);
		for (@Pc(92) int local92 = 44; local92 < local90 + 44; local92++) {
			aByteArray15[local92] = -128;
		}
		@Pc(123) int local123;
		@Pc(133) int local133;
		@Pc(147) int local147;
		for (@Pc(106) int local106 = 0; local106 < 10; local106++) {
			if (this.aClass44Array1[local106] != null) {
				local123 = this.aClass44Array1[local106].anInt947 * 22050 / 1000;
				local133 = this.aClass44Array1[local106].anInt948 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass44Array1[local106].method576(local123, this.aClass44Array1[local106].anInt947);
				for (local147 = 0; local147 < local123; local147++) {
					aByteArray15[local147 + local133 + 44] += (byte) (local145[local147] >> 8);
				}
			}
		}
		if (arg0 > 1) {
			local58 += 44;
			local65 += 44;
			local51 += 44;
			local90 += 44;
			local123 = local90 - local51;
			for (local133 = local51 - 1; local133 >= local65; local133--) {
				aByteArray15[local133 + local123] = aByteArray15[local133];
			}
			for (@Pc(205) int local205 = 1; local205 < arg0; local205++) {
				local123 = (local65 - local58) * local205;
				for (local147 = local58; local147 < local65; local147++) {
					aByteArray15[local147 + local123] = aByteArray15[local147];
				}
			}
			local90 -= 44;
		}
		return local90;
	}

	@OriginalClass("client!zb")
	public static final class WaveTone {

		@OriginalMember(owner = "client!zb", name = "a", descriptor = "I")
		public static final int anInt943 = 8;
		@OriginalMember(owner = "client!zb", name = "u", descriptor = "[I")
		public static final int[] anIntArray242 = new int[5];
		@OriginalMember(owner = "client!zb", name = "v", descriptor = "[I")
		public static final int[] anIntArray243 = new int[5];
		@OriginalMember(owner = "client!zb", name = "w", descriptor = "[I")
		public static final int[] anIntArray244 = new int[5];
		@OriginalMember(owner = "client!zb", name = "x", descriptor = "[I")
		public static final int[] anIntArray245 = new int[5];
		@OriginalMember(owner = "client!zb", name = "y", descriptor = "[I")
		public static final int[] anIntArray246 = new int[5];
		@OriginalMember(owner = "client!zb", name = "r", descriptor = "[I")
		public static int[] anIntArray239;
		@OriginalMember(owner = "client!zb", name = "s", descriptor = "[I")
		public static int[] anIntArray240;
		@OriginalMember(owner = "client!zb", name = "t", descriptor = "[I")
		public static int[] anIntArray241;
		@OriginalMember(owner = "client!zb", name = "c", descriptor = "Lclient!xb;")
		private WaveEnvelope aClass42_1;

		@OriginalMember(owner = "client!zb", name = "d", descriptor = "Lclient!xb;")
		private WaveEnvelope aClass42_2;

		@OriginalMember(owner = "client!zb", name = "e", descriptor = "Lclient!xb;")
		private WaveEnvelope aClass42_3;

		@OriginalMember(owner = "client!zb", name = "f", descriptor = "Lclient!xb;")
		private WaveEnvelope aClass42_4;

		@OriginalMember(owner = "client!zb", name = "g", descriptor = "Lclient!xb;")
		private WaveEnvelope aClass42_5;

		@OriginalMember(owner = "client!zb", name = "h", descriptor = "Lclient!xb;")
		private WaveEnvelope aClass42_6;

		@OriginalMember(owner = "client!zb", name = "i", descriptor = "Lclient!xb;")
		private WaveEnvelope aClass42_7;

		@OriginalMember(owner = "client!zb", name = "j", descriptor = "Lclient!xb;")
		private WaveEnvelope aClass42_8;

		@OriginalMember(owner = "client!zb", name = "n", descriptor = "I")
		private int anInt945;

		@OriginalMember(owner = "client!zb", name = "q", descriptor = "I")
		public int anInt948;

		@OriginalMember(owner = "client!zb", name = "b", descriptor = "I")
		private final int anInt944 = -15143;

		@OriginalMember(owner = "client!zb", name = "k", descriptor = "[I")
		private final int[] anIntArray236 = new int[5];

		@OriginalMember(owner = "client!zb", name = "l", descriptor = "[I")
		private final int[] anIntArray237 = new int[5];

		@OriginalMember(owner = "client!zb", name = "m", descriptor = "[I")
		private final int[] anIntArray238 = new int[5];

		@OriginalMember(owner = "client!zb", name = "o", descriptor = "I")
		private int anInt946 = 100;

		@OriginalMember(owner = "client!zb", name = "p", descriptor = "I")
		public int anInt947 = 500;

		@OriginalMember(owner = "client!zb", name = "a", descriptor = "()V")
		public static void method575() {
			anIntArray240 = new int[32768];
			for (@Pc(6) int local6 = 0; local6 < 32768; local6++) {
				if (Math.random() > 0.5D) {
					anIntArray240[local6] = 1;
				} else {
					anIntArray240[local6] = -1;
				}
			}
			anIntArray241 = new int[32768];
			for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
				anIntArray241[local31] = (int) (Math.sin((double) local31 / 5215.1903D) * 16384.0D);
			}
			anIntArray239 = new int[220500];
		}

		@OriginalMember(owner = "client!zb", name = "a", descriptor = "(II)[I")
		public int[] method576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
			for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
				anIntArray239[local3] = 0;
			}
			if (arg1 < 10) {
				return anIntArray239;
			}
			@Pc(26) double local26 = (double) arg0 / ((double) arg1 + 0.0D);
			this.aClass42_1.method553(anInt943);
			this.aClass42_2.method553(anInt943);
			@Pc(36) int local36 = 0;
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = 0;
			if (this.aClass42_3 != null) {
				this.aClass42_3.method553(anInt943);
				this.aClass42_4.method553(anInt943);
				local36 = (int) ((double) (this.aClass42_3.anInt820 - this.aClass42_3.anInt819) * 32.768D / local26);
				local38 = (int) ((double) this.aClass42_3.anInt819 * 32.768D / local26);
			}
			@Pc(77) int local77 = 0;
			@Pc(79) int local79 = 0;
			@Pc(81) int local81 = 0;
			if (this.aClass42_5 != null) {
				this.aClass42_5.method553(anInt943);
				this.aClass42_6.method553(anInt943);
				local77 = (int) ((double) (this.aClass42_5.anInt820 - this.aClass42_5.anInt819) * 32.768D / local26);
				local79 = (int) ((double) this.aClass42_5.anInt819 * 32.768D / local26);
			}
			for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
				if (this.anIntArray236[local118] != 0) {
					anIntArray242[local118] = 0;
					anIntArray243[local118] = (int) ((double) this.anIntArray238[local118] * local26);
					anIntArray244[local118] = (this.anIntArray236[local118] << 14) / 100;
					anIntArray245[local118] = (int) ((double) (this.aClass42_1.anInt820 - this.aClass42_1.anInt819) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray237[local118]) / local26);
					anIntArray246[local118] = (int) ((double) this.aClass42_1.anInt819 * 32.768D / local26);
				}
			}
			@Pc(201) int local201;
			@Pc(207) int local207;
			@Pc(222) int local222;
			for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
				local201 = this.aClass42_1.method554(true, arg0);
				local207 = this.aClass42_2.method554(true, arg0);
				@Pc(216) int local216;
				if (this.aClass42_3 != null) {
					local216 = this.aClass42_3.method554(true, arg0);
					local222 = this.aClass42_4.method554(true, arg0);
					local201 += this.method577(-15143, local222, local40, this.aClass42_3.anInt821) >> 1;
					local40 += (local216 * local36 >> 16) + local38;
				}
				if (this.aClass42_5 != null) {
					local216 = this.aClass42_5.method554(true, arg0);
					local222 = this.aClass42_6.method554(true, arg0);
					local207 = local207 * ((this.method577(-15143, local222, local81, this.aClass42_5.anInt821) >> 1) + 32768) >> 15;
					local81 += (local216 * local77 >> 16) + local79;
				}
				for (local216 = 0; local216 < 5; local216++) {
					if (this.anIntArray236[local216] != 0) {
						local222 = local193 + anIntArray243[local216];
						if (local222 < arg0) {
							anIntArray239[local222] += this.method577(-15143, local207 * anIntArray244[local216] >> 15, anIntArray242[local216], this.aClass42_1.anInt821);
							anIntArray242[local216] += (local201 * anIntArray245[local216] >> 16) + anIntArray246[local216];
						}
					}
				}
			}
			if (this.aClass42_7 != null) {
				this.aClass42_7.method553(anInt943);
				this.aClass42_8.method553(anInt943);
				local201 = 0;
				@Pc(367) boolean local367 = false;
				@Pc(369) boolean local369 = true;
				for (local222 = 0; local222 < arg0; local222++) {
					@Pc(379) int local379 = this.aClass42_7.method554(true, arg0);
					@Pc(385) int local385 = this.aClass42_8.method554(true, arg0);
					if (local369) {
						local207 = this.aClass42_7.anInt819 + ((this.aClass42_7.anInt820 - this.aClass42_7.anInt819) * local379 >> 8);
					} else {
						local207 = this.aClass42_7.anInt819 + ((this.aClass42_7.anInt820 - this.aClass42_7.anInt819) * local385 >> 8);
					}
					local201 += 256;
					if (local201 >= local207) {
						local201 = 0;
						local369 = !local369;
					}
					if (local369) {
						anIntArray239[local222] = 0;
					}
				}
			}
			if (this.anInt945 > 0 && this.anInt946 > 0) {
				local201 = (int) ((double) this.anInt945 * local26);
				for (local207 = local201; local207 < arg0; local207++) {
					anIntArray239[local207] += anIntArray239[local207 - local201] * this.anInt946 / 100;
				}
			}
			for (local201 = 0; local201 < arg0; local201++) {
				if (anIntArray239[local201] < -32768) {
					anIntArray239[local201] = -32768;
				}
				if (anIntArray239[local201] > 32767) {
					anIntArray239[local201] = 32767;
				}
			}
			return anIntArray239;
		}

		@OriginalMember(owner = "client!zb", name = "a", descriptor = "(IIII)I")
		private int method577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
			try {
				if (arg0 != this.anInt944) {
					return 2;
				} else if (arg3 == 1) {
					return (arg2 & 0x7FFF) < 16384 ? arg1 : -arg1;
				} else if (arg3 == 2) {
					return anIntArray241[arg2 & 0x7FFF] * arg1 >> 14;
				} else if (arg3 == 3) {
					return ((arg2 & 0x7FFF) * arg1 >> 14) - arg1;
				} else if (arg3 == 4) {
					return anIntArray240[arg2 / 2607 & 0x7FFF] * arg1;
				} else {
					return 0;
				}
			} catch (@Pc(60) RuntimeException local60) {
				signlink.reporterror("41611, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local60.toString());
				throw new RuntimeException();
			}
		}

		@OriginalMember(owner = "client!zb", name = "a", descriptor = "(ZLclient!kb;)V")
		public void method578(@OriginalArg(0) boolean arg0, @OriginalArg(1) Packet arg1) {
			try {
				this.aClass42_1 = new WaveEnvelope();
				this.aClass42_1.method552(false, arg1);
				this.aClass42_2 = new WaveEnvelope();
				this.aClass42_2.method552(false, arg1);
				@Pc(24) int local24 = arg1.method391();
				if (arg0) {
					throw new NullPointerException();
				}
				if (local24 != 0) {
					arg1.anInt561--;
					this.aClass42_3 = new WaveEnvelope();
					this.aClass42_3.method552(false, arg1);
					this.aClass42_4 = new WaveEnvelope();
					this.aClass42_4.method552(false, arg1);
				}
				local24 = arg1.method391();
				if (local24 != 0) {
					arg1.anInt561--;
					this.aClass42_5 = new WaveEnvelope();
					this.aClass42_5.method552(false, arg1);
					this.aClass42_6 = new WaveEnvelope();
					this.aClass42_6.method552(false, arg1);
				}
				local24 = arg1.method391();
				if (local24 != 0) {
					arg1.anInt561--;
					this.aClass42_7 = new WaveEnvelope();
					this.aClass42_7.method552(false, arg1);
					this.aClass42_8 = new WaveEnvelope();
					this.aClass42_8.method552(false, arg1);
				}
				for (@Pc(122) int local122 = 0; local122 < 10; local122++) {
					@Pc(132) int local132 = arg1.method405();
					if (local132 == 0) {
						break;
					}
					this.anIntArray236[local122] = local132;
					this.anIntArray237[local122] = arg1.method404();
					this.anIntArray238[local122] = arg1.method405();
				}
				this.anInt945 = arg1.method405();
				this.anInt946 = arg1.method405();
				this.anInt947 = arg1.method393();
				this.anInt948 = arg1.method393();
			} catch (@Pc(173) RuntimeException local173) {
				signlink.reporterror("36876, " + arg0 + ", " + arg1 + ", " + local173.toString());
				throw new RuntimeException();
			}
		}
	}

	@OriginalClass("client!xb")
	public static final class WaveEnvelope {

		@OriginalMember(owner = "client!xb", name = "a", descriptor = "I")
		private int anInt818;

		@OriginalMember(owner = "client!xb", name = "b", descriptor = "[I")
		private int[] anIntArray227;

		@OriginalMember(owner = "client!xb", name = "c", descriptor = "[I")
		private int[] anIntArray228;

		@OriginalMember(owner = "client!xb", name = "d", descriptor = "I")
		public int anInt819;

		@OriginalMember(owner = "client!xb", name = "e", descriptor = "I")
		public int anInt820;

		@OriginalMember(owner = "client!xb", name = "f", descriptor = "I")
		public int anInt821;

		@OriginalMember(owner = "client!xb", name = "g", descriptor = "I")
		private int anInt822;

		@OriginalMember(owner = "client!xb", name = "h", descriptor = "I")
		private int anInt823;

		@OriginalMember(owner = "client!xb", name = "i", descriptor = "I")
		private int anInt824;

		@OriginalMember(owner = "client!xb", name = "j", descriptor = "I")
		private int anInt825;

		@OriginalMember(owner = "client!xb", name = "k", descriptor = "I")
		private int anInt826;

		@OriginalMember(owner = "client!xb", name = "a", descriptor = "(ZLclient!kb;)V")
		public void method552(@OriginalArg(0) boolean arg0, @OriginalArg(1) Packet arg1) {
			try {
				this.anInt821 = arg1.method391();
				this.anInt819 = arg1.method396();
				this.anInt820 = arg1.method396();
				this.anInt818 = arg1.method391();
				this.anIntArray227 = new int[this.anInt818];
				this.anIntArray228 = new int[this.anInt818];
				@Pc(31) int local31;
				if (arg0) {
					for (local31 = 1; local31 > 0; local31++) {
					}
				}
				for (local31 = 0; local31 < this.anInt818; local31++) {
					this.anIntArray227[local31] = arg1.method393();
					this.anIntArray228[local31] = arg1.method393();
				}
			} catch (@Pc(67) RuntimeException local67) {
				signlink.reporterror("83915, " + arg0 + ", " + arg1 + ", " + local67.toString());
				throw new RuntimeException();
			}
		}

		@OriginalMember(owner = "client!xb", name = "a", descriptor = "(I)V")
		public void method553(@OriginalArg(0) int arg0) {
			try {
				this.anInt822 = 0;
				this.anInt823 = 0;
				this.anInt824 = 0;
				this.anInt825 = 0;
				if (arg0 >= 8 && arg0 <= 8) {
					this.anInt826 = 0;
				}
			} catch (@Pc(23) RuntimeException local23) {
				signlink.reporterror("47965, " + arg0 + ", " + local23.toString());
				throw new RuntimeException();
			}
		}

		@OriginalMember(owner = "client!xb", name = "a", descriptor = "(ZI)I")
		public int method554(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
			try {
				if (!arg0) {
					for (@Pc(3) int local3 = 1; local3 > 0; local3++) {
					}
				}
				if (this.anInt826 >= this.anInt822) {
					this.anInt825 = this.anIntArray228[this.anInt823++] << 15;
					if (this.anInt823 >= this.anInt818) {
						this.anInt823 = this.anInt818 - 1;
					}
					this.anInt822 = (int) ((double) this.anIntArray227[this.anInt823] / 65536.0D * (double) arg1);
					if (this.anInt822 > this.anInt826) {
						this.anInt824 = ((this.anIntArray228[this.anInt823] << 15) - this.anInt825) / (this.anInt822 - this.anInt826);
					}
				}
				this.anInt825 += this.anInt824;
				this.anInt826++;
				return this.anInt825 - this.anInt824 >> 15;
			} catch (@Pc(97) RuntimeException local97) {
				signlink.reporterror("65731, " + arg0 + ", " + arg1 + ", " + local97.toString());
				throw new RuntimeException();
			}
		}
	}

}
