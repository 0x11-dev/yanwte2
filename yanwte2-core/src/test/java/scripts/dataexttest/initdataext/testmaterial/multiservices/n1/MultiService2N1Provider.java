package scripts.dataexttest.initdataext.testmaterial.multiservices.n1;

import scripts.dataexttest.initdataext.testmaterial.Context;
import scripts.dataexttest.initdataext.testmaterial.multiservices.MultiService2;

/**
 * @author fanshen
 * @since 2017/12/15
 */
public class MultiService2N1Provider implements MultiService2 {
    @Override
    public Void apply(Context context) {
        DataExtN1 dataExt = context.getDataExt();
        dataExt.setI(dataExt.getI() + 1);
        return null;
    }
}
