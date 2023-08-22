package org.joget.scheduler;

import java.util.Map;
import org.joget.apps.app.service.AppUtil;
import org.joget.commons.util.LogUtil;
import org.joget.plugin.base.DefaultApplicationPlugin;

public class EchoPlugin extends DefaultApplicationPlugin {
    @Override
    public Object execute(Map props) {
        String echoText = getPropertyString("echoText");
        if (echoText == null) {
            echoText = "";
        }
        LogUtil.info(getClassName(), "Echo: " + echoText);
        return null;
    }

    @Override
    public String getName() {
        return "Echo Plugin";
    }

    @Override
    public String getVersion() {
        return "1.0";
    }

    @Override
    public String getDescription() {
        return "Echo Plugin [" + Activator.GITHUB_URL + "]";
    }

    @Override
    public String getLabel() {
        return "Echo Plugin";
    }

    @Override
    public String getClassName() {
        return getClass().getName();
    }

    @Override
    public String getPropertyOptions() {
        return AppUtil.readPluginResource(getClass().getName(), "/properties/form/EchoPlugin.json", null, true, "messages/EchoPlugin");
    }
}
