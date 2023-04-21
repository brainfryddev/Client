package jagex2.datastruct;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

// Hashable: A node that can be associated with a key inside Hashtable, LruCache, and Stack
@OriginalClass("client!db")
public class Hashable extends Linkable {

	@OriginalMember(owner = "client!db", name = "e", descriptor = "Lclient!db;")
	public Hashable aClass1_Sub3_15;

	@OriginalMember(owner = "client!db", name = "f", descriptor = "Lclient!db;")
	public Hashable aClass1_Sub3_16;

	@OriginalMember(owner = "client!db", name = "b", descriptor = "()V")
	public final void method377() {
		if (this.aClass1_Sub3_16 != null) {
			this.aClass1_Sub3_16.aClass1_Sub3_15 = this.aClass1_Sub3_15;
			this.aClass1_Sub3_15.aClass1_Sub3_16 = this.aClass1_Sub3_16;
			this.aClass1_Sub3_15 = null;
			this.aClass1_Sub3_16 = null;
		}
	}
}
