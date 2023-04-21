package jagex2.graphics;

import jagex2.client.Signlink;
import jagex2.io.JagFile;
import jagex2.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

// Sequence Base: Animation skeleton
@OriginalClass("client!f")
public final class SeqBase {

	@OriginalMember(owner = "client!f", name = "a", descriptor = "[Lclient!f;")
	public static SeqBase[] aClass10Array1;
	@OriginalMember(owner = "client!f", name = "b", descriptor = "I")
	public int anInt385;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "[I")
	public int[] anIntArray128;

	@OriginalMember(owner = "client!f", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZLclient!ub;)V")
	public static void method261(@OriginalArg(0) boolean arg0, @OriginalArg(1) JagFile arg1) {
		try {
			@Pc(11) Packet local11 = new Packet(363, arg1.method536("base_head.dat", null, (byte) 2));
			@Pc(21) Packet local21 = new Packet(363, arg1.method536("base_type.dat", null, (byte) 2));
			@Pc(31) Packet local31 = new Packet(363, arg1.method536("base_label.dat", null, (byte) 2));
			@Pc(34) int local34 = local11.method393();
			@Pc(37) int local37 = local11.method393();
			aClass10Array1 = new SeqBase[local37 + 1];
			if (arg0) {
				throw new NullPointerException();
			}
			for (@Pc(50) int local50 = 0; local50 < local34; local50++) {
				@Pc(55) int local55 = local11.method393();
				@Pc(58) int local58 = local11.method391();
				@Pc(61) int[] local61 = new int[local58];
				@Pc(64) int[][] local64 = new int[local58][];
				for (@Pc(66) int local66 = 0; local66 < local58; local66++) {
					local61[local66] = local21.method391();
					@Pc(76) int local76 = local31.method391();
					local64[local66] = new int[local76];
					for (@Pc(83) int local83 = 0; local83 < local76; local83++) {
						local64[local66][local83] = local31.method391();
					}
				}
				aClass10Array1[local55] = new SeqBase();
				aClass10Array1[local55].anInt385 = local58;
				aClass10Array1[local55].anIntArray128 = local61;
				aClass10Array1[local55].anIntArrayArray11 = local64;
			}
		} catch (@Pc(127) RuntimeException local127) {
			Signlink.reporterror("88924, " + arg0 + ", " + arg1 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

}
