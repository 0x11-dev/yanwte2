package scripts.serviceorchestrator.testmaterial.simple;

import com.github.winteryoung.yanwte2.core.ServiceOrchestrator;
import com.github.winteryoung.yanwte2.core.spi.Combinator;
import com.github.winteryoung.yanwte2.core.spi.LeafCombinator;

import java.util.function.Function;

/**
 * @author fanshen
 * @since 2017/12/11
 */
public interface NormalService extends Function<Integer, Integer>, ServiceOrchestrator<NormalService> {
    @Override
    default Combinator tree() {
        return (LeafCombinator) arg -> (Integer) arg + 3;
    }
}
