package vn.hcmute.springboot.config;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

public class CustomSiteMeshFilter extends ConfigurableSiteMeshFilter {

    @Override
    protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
        builder
            .addDecoratorPath("/*", "web.jsp")
            .addDecoratorPath("/admin/*", "admin.jsp")
            .addExcludedPath("/image*")
            .addExcludedPath("/product-image*")
            .addExcludedPath("/profile-image*")
            .addExcludedPath("/static/*")
            .addExcludedPath("/static/**")
            .addExcludedPath("/api/*")
            .addExcludedPath("/api/**");
    }
}
