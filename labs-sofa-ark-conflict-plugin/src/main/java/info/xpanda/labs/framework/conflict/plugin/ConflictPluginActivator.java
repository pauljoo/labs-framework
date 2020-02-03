package info.xpanda.labs.framework.conflict.plugin;

import com.alipay.sofa.ark.spi.model.PluginContext;
import com.alipay.sofa.ark.spi.service.PluginActivator;

/**
 * @author Paul Jiang
 * @since 20200203
 */
public class ConflictPluginActivator implements PluginActivator {
    @Override
    public void start(PluginContext context) {
        System.out.println("starting in sample ark plugin activator");
        context.publishService(ConflictNoSuchMethod.class, new ConflictNoSuchMethodImpl());
    }

    @Override
    public void stop(PluginContext context) {
        System.out.println("stopping in ark plugin activator");
    }
}
