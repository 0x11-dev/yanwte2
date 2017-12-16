package scripts.dataexttest.initdataext.testmaterial.multiservices.n2;

import scripts.dataexttest.initdataext.testmaterial.Context;
import scripts.dataexttest.initdataext.testmaterial.multiservices.MultiService1;

/**
 * @author fanshen
 * @since 2017/12/15
 */
public class MultiService1N2Provider implements MultiService1 {
    @Override
    public Void apply(Context context) {
        DataExtN2 dataExt = context.getDataExt();
        dataExt.setI(dataExt.getI() + 1);
        return null;
    }
}
