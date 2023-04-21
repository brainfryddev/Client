package jagex2.datastruct;

import jagex2.client.Signlink;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

// LinkList: A doubly-linked list of Linkable objects
@OriginalClass("client!ob")
public final class LinkList {

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "Lclient!u;")
	private Linkable aClass1_34;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "Z")
	private boolean aBoolean139 = true;

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "B")
	private final byte aByte32 = 2;

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
	private final int anInt664 = -546;

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
	private int anInt665 = -676;

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "Lclient!u;")
	private final Linkable aClass1_33 = new Linkable();

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(I)V")
	public LinkList(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 0) {
				this.aBoolean139 = !this.aBoolean139;
			}
			this.aClass1_33.aClass1_41 = this.aClass1_33;
			this.aClass1_33.aClass1_42 = this.aClass1_33;
		} catch (@Pc(40) RuntimeException local40) {
			Signlink.reporterror("59838, " + arg0 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!u;)V")
	public void method453(@OriginalArg(0) Linkable arg0) {
		if (arg0.aClass1_42 != null) {
			arg0.method567();
		}
		arg0.aClass1_42 = this.aClass1_33.aClass1_42;
		arg0.aClass1_41 = this.aClass1_33;
		arg0.aClass1_42.aClass1_41 = arg0;
		arg0.aClass1_41.aClass1_42 = arg0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!u;I)V")
	public void method454(@OriginalArg(0) Linkable arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0.aClass1_42 != null) {
				arg0.method567();
			}
			arg0.aClass1_42 = this.aClass1_33;
			if (arg1 == -26173) {
				arg0.aClass1_41 = this.aClass1_33.aClass1_41;
				arg0.aClass1_42.aClass1_41 = arg0;
				arg0.aClass1_41.aClass1_42 = arg0;
			}
		} catch (@Pc(27) RuntimeException local27) {
			Signlink.reporterror("2399, " + arg0 + ", " + arg1 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "()Lclient!u;")
	public Linkable method455() {
		@Pc(3) Linkable local3 = this.aClass1_33.aClass1_41;
		if (local3 == this.aClass1_33) {
			return null;
		} else {
			local3.method567();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "()Lclient!u;")
	public Linkable method456() {
		@Pc(3) Linkable local3 = this.aClass1_33.aClass1_41;
		if (local3 == this.aClass1_33) {
			this.aClass1_34 = null;
			return null;
		} else {
			this.aClass1_34 = local3.aClass1_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)Lclient!u;")
	public Linkable method457(@OriginalArg(0) byte arg0) {
		try {
			@Pc(3) Linkable local3 = this.aClass1_33.aClass1_42;
			if (local3 == this.aClass1_33) {
				this.aClass1_34 = null;
				return null;
			}
			this.aClass1_34 = local3.aClass1_42;
			if (arg0 != this.aByte32) {
				this.anInt665 = 112;
			}
			return local3;
		} catch (@Pc(26) RuntimeException local26) {
			Signlink.reporterror("37919, " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)Lclient!u;")
	public Linkable method458(@OriginalArg(0) int arg0) {
		try {
			if (arg0 <= 0) {
				throw new NullPointerException();
			}
			@Pc(8) Linkable local8 = this.aClass1_34;
			if (local8 == this.aClass1_33) {
				this.aClass1_34 = null;
				return null;
			} else {
				this.aClass1_34 = local8.aClass1_41;
				return local8;
			}
		} catch (@Pc(24) RuntimeException local24) {
			Signlink.reporterror("89761, " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)Lclient!u;")
	public Linkable method459(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(2) Linkable local2 = this.aClass1_34;
			if (arg0) {
				for (@Pc(6) int local6 = 1; local6 > 0; local6++) {
				}
			}
			if (local2 == this.aClass1_33) {
				this.aClass1_34 = null;
				return null;
			} else {
				this.aClass1_34 = local2.aClass1_42;
				return local2;
			}
		} catch (@Pc(27) RuntimeException local27) {
			Signlink.reporterror("58136, " + arg0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "()V")
	public void method460() {
		while (true) {
			@Pc(3) Linkable local3 = this.aClass1_33.aClass1_41;
			if (local3 == this.aClass1_33) {
				return;
			}
			local3.method567();
		}
	}
}
