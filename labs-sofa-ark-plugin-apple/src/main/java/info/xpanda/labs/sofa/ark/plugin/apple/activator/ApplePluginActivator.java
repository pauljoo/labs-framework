package info.xpanda.labs.sofa.ark.plugin.apple.activator;

import com.alipay.sofa.ark.exception.ArkRuntimeException;
import com.alipay.sofa.ark.spi.model.PluginContext;
import com.alipay.sofa.ark.spi.service.PluginActivator;
import info.xpanda.labs.sofa.ark.plugin.apple.impl.AppleServiceImpl;
import info.xpanda.labs.sofa.ark.plugin.apple.facade.AppleService;

/**
 * @author Paul Jiang
 * @since 20200203
 */
public class ApplePluginActivator implements PluginActivator {
    public void start(PluginContext context) throws ArkRuntimeException {
        System.out.println(Thread.currentThread().getContextClassLoader());
        System.out.println("starting in sample ark plugin activator");
        context.publishService(AppleService.class, new AppleServiceImpl());
    }

    public void stop(PluginContext context) throws ArkRuntimeException {
        System.out.println("stopping in ark plugin activator");
    }
}
