package com.hlz.framework.struts2filter;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import com.opensymphony.xwork2.config.ConfigurationException;
import com.opensymphony.xwork2.config.providers.XmlConfigurationProvider;
import com.opensymphony.xwork2.inject.ContainerBuilder;
import com.opensymphony.xwork2.util.location.LocatableProperties;

/**
 * 自动扫描加载Struts2.配置文件的工具类
 * struts的默认配置文件路径为  FILE_PATTERNl
 * classpath*为类的根目录
 * 可以根据实际项目的struts配置文件路径更改
 * <p>
 * 配置struts2和核心过滤器
 * <filter>
 * <filter-name>struts2</filter-name>
 * <filter-class>org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter</filter-class>
 * 手动引入spring的 struts.xml 的位置
 * <init-param>
 * <param-name>config</param-name>
 * <param-value>struts-default.xml,struts-plugin.xml,config/struts/struts.xml</param-value>
 * </init-param>
 * 自动扫描加载Struts2.配置文件的工具类
 * <init-param>
 * <param-name>configProviders</param-name>
 * <param-value>com.hlz.framework.struts2filter.CutomConfigurationProvider</param-value>
 * </init-param>
 * </filter>
 */
public class CutomConfigurationProvider extends XmlConfigurationProvider {
    private static final String FILE_PATTERN = "classpath*:config/struts/*/struts-*.xml";

    public CutomConfigurationProvider() {
        Map<String, String> mappings = new HashMap<String, String>();

        mappings.put(
                "-//Apache Software Foundation//DTD Struts Configuration 2.0//EN",
                "struts-2.0.dtd");
        mappings.put(
                "-//Apache Software Foundation//DTD Struts Configuration 2.1//EN",
                "struts-2.1.dtd");
        mappings.put(
                "-//Apache Software Foundation//DTD Struts Configuration 2.1.7//EN",
                "struts-2.1.7.dtd");
        mappings.put(
                "-//Apache Software Foundation//DTD Struts Configuration 2.3//EN",
                "struts-2.3.dtd");
        setDtdMappings(mappings);
    }

    /*
     * (non-Javadoc)
     *
     * @see com.opensymphony.xwork2.config.ContainerProvider#needsReload()
     */
    @Override
    public boolean needsReload() {
        return true;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * com.opensymphony.xwork2.config.ContainerProvider#register(com.opensymphony
     * .xwork2.inject.ContainerBuilder,
     * com.opensymphony.xwork2.util.location.LocatableProperties)
     */
    @Override
    public void register(ContainerBuilder containerBuilder,
                         LocatableProperties props) throws ConfigurationException {
        super.register(containerBuilder, props);
    }

    /*
     * (non-Javadoc)
     *
     * @see com.opensymphony.xwork2.config.PackageProvider#loadPackages()
     */
    @Override
    public void loadPackages() throws ConfigurationException {
        super.loadPackages();
    }

    @Override
    protected Iterator<URL> getConfigurationUrls(String fileName)
            throws IOException {
        List<URL> urls = new ArrayList<URL>();
        Resource[] resources = getAllResourcesUrl();
        for (Resource resource : resources) {
            urls.add(resource.getURL());
        }

        return urls.iterator();
    }

    /**
     * 获取系统中需要搜寻的struts的配置
     *
     * @return
     * @throws IOException
     */
    private Resource[] getAllResourcesUrl() {
        ResourcePatternResolver resoler = new PathMatchingResourcePatternResolver();
        try {
            return resoler.getResources(FILE_PATTERN);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Resource[0];
    }

}