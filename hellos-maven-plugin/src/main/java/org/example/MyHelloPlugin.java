package org.example;


import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

/**
 * @author ColorXJH
 * @ClassName MyHelloPlugin.java
 * @Package: com.master.xjh
 * @Description：
 * @Datetime: 2024/1/1 15:31
 */
@Mojo(name="sayHello")
public class MyHelloPlugin extends AbstractMojo {
    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("---->this is my first maven plugin<----");
    }
}
