package info.xpanda.labs.sofa.ark.plugin.banana.activator;

import com.alipay.sofa.ark.exception.ArkRuntimeException;
import com.alipay.sofa.ark.spi.model.PluginContext;
import com.alipay.sofa.ark.spi.service.PluginActivator;
import info.xpanda.labs.sofa.ark.plugin.banana.facade.BananaService;
import info.xpanda.labs.sofa.ark.plugin.banana.impl.BananaServiceImpl;

/**
 * @author Paul Jiang
 * @since 20200203
 */
public class BananaPluginActivator implements PluginActivator {
    public void start(PluginContext context) throws ArkRuntimeException {
        System.out.println(Thread.currentThread().getContextClassLoader());
        System.out.println("starting in sample ark plugin activator");
        context.publishService(BananaService.class, new BananaServiceImpl());
    }

    public void stop(PluginContext context) throws ArkRuntimeException {
        System.out.println("stopping in ark plugin activator");
    }
}
