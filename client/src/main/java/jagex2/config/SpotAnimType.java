package jagex2.config;

import jagex2.client.Signlink;
import jagex2.datastruct.LruCache;
import jagex2.graphics.Model;
import jagex2.io.JagFile;
import jagex2.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

// SpotAnimType: Spot animation definitions (graphics that are not bound to an entity)
@OriginalClass("client!kc")
public final class SpotAnimType {

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
	private static final int anInt566 = 473;
	@OriginalMember(owner = "client!kc", name = "c", descriptor = "[Lclient!kc;")
	public static SpotAnimType[] aClass21Array1;
	@OriginalMember(owner = "client!kc", name = "p", descriptor = "Lclient!s;")
	public static LruCache aClass35_8 = new LruCache((byte) 0, 30);
	@OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
	private static int anInt567;
	@OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
	public int anInt568;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
	private int anInt569;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "Lclient!jc;")
	public SeqType aClass19_1;

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
	public int anInt573;

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
	public int anInt574;

	@OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
	public int anInt575;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
	private int anInt570 = -1;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "Z")
	public boolean aBoolean131 = false;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "[I")
	private final int[] anIntArray192 = new int[6];

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "[I")
	private final int[] anIntArray193 = new int[6];

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
	public int anInt571 = 128;

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
	public int anInt572 = 128;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!ub;I)V")
	public static void method407(@OriginalArg(0) JagFile arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) int local3 = 91 / arg1;
			@Pc(13) Packet local13 = new Packet(363, arg0.method536("spotanim.dat", null, (byte) 2));
			anInt567 = local13.method393();
			if (aClass21Array1 == null) {
				aClass21Array1 = new SpotAnimType[anInt567];
			}
			for (@Pc(23) int local23 = 0; local23 < anInt567; local23++) {
				if (aClass21Array1[local23] == null) {
					aClass21Array1[local23] = new SpotAnimType();
				}
				aClass21Array1[local23].anInt568 = local23;
				aClass21Array1[local23].method408(false, local13);
			}
		} catch (@Pc(52) RuntimeException local52) {
			Signlink.reporterror("26561, " + arg0 + ", " + arg1 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZLclient!kb;)V")
	public void method408(@OriginalArg(0) boolean arg0, @OriginalArg(1) Packet arg1) {
		try {
			@Pc(5) int local5;
			if (arg0) {
				for (local5 = 1; local5 > 0; local5++) {
				}
			}
			while (true) {
				while (true) {
					local5 = arg1.method391();
					if (local5 == 0) {
						return;
					}
					if (local5 == 1) {
						this.anInt569 = arg1.method393();
					} else if (local5 == 2) {
						this.anInt570 = arg1.method393();
						if (SeqType.aClass19Array1 != null) {
							this.aClass19_1 = SeqType.aClass19Array1[this.anInt570];
						}
					} else if (local5 == 3) {
						this.aBoolean131 = true;
					} else if (local5 == 4) {
						this.anInt571 = arg1.method393();
					} else if (local5 == 5) {
						this.anInt572 = arg1.method393();
					} else if (local5 == 6) {
						this.anInt573 = arg1.method393();
					} else if (local5 == 7) {
						this.anInt574 = arg1.method391();
					} else if (local5 == 8) {
						this.anInt575 = arg1.method391();
					} else if (local5 >= 40 && local5 < 50) {
						this.anIntArray192[local5 - 40] = arg1.method393();
					} else if (local5 >= 50 && local5 < 60) {
						this.anIntArray193[local5 - 50] = arg1.method393();
					} else {
						System.out.println("Error unrecognised spotanim config code: " + local5);
					}
				}
			}
		} catch (@Pc(138) RuntimeException local138) {
			Signlink.reporterror("42060, " + arg0 + ", " + arg1 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "()Lclient!eb;")
	public Model method409() {
		@Pc(6) Model local6 = (Model) aClass35_8.method527((long) this.anInt568);
		if (local6 != null) {
			return local6;
		}
		local6 = new Model(false, this.anInt569);
		for (@Pc(19) int local19 = 0; local19 < 6; local19++) {
			if (this.anIntArray192[0] != 0) {
				local6.method237(this.anIntArray192[local19], this.anIntArray193[local19]);
			}
		}
		aClass35_8.method528(6, (long) this.anInt568, local6);
		return local6;
	}
}
