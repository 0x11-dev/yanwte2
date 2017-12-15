package scripts.providernstest.initdataext.testmaterial.simple;

import com.github.winteryoung.yanwte2.core.ServiceOrchestrator;
import com.github.winteryoung.yanwte2.core.spi.Combinator;
import scripts.providernstest.initdataext.testmaterial.simple.ns3.Service3Provider1;
import scripts.providernstest.initdataext.testmaterial.simple.ns3.Service3Provider2;

/**
 * @author Winter Young
 * @since 2017/12/13
 */
public class Service3Orchestrator implements ServiceOrchestrator {
    @Override
    public Combinator tree() {
        return chain(
                provider(Service3Provider1.class),
                provider(Service3Provider2.class)
        );
    }
}
