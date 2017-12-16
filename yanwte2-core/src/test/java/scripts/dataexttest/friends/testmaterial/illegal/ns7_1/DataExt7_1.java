package scripts.dataexttest.friends.testmaterial.illegal.ns7_1;

import com.github.winteryoung.yanwte2.core.DataExtension;
import com.github.winteryoung.yanwte2.core.DataExtensionInitializer;
import java.util.Set;
import org.assertj.core.util.Sets;
import scripts.dataexttest.friends.testmaterial.illegal.Context7;

/**
 * @author Winter Young
 * @since 2017/12/16
 */
public class DataExt7_1 implements DataExtension, DataExtensionInitializer<Context7, DataExt7_1> {
    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public Set<String> getFriendProviderPackages() {
        return Sets.newLinkedHashSet("scripts.dataexttest.friends.testmaterial.legal.ns7_1");
    }

    @Override
    public DataExt7_1 apply(Context7 context6) {
        return new DataExt7_1();
    }
}
