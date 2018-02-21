package sk.akademiasovy.tipos.server;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class TiposApplication extends Application<TiposConfiguration> {

    public static void main(final String[] args) throws Exception {
        new TiposApplication().run(args);
    }

    @Override
    public String getName() {
        return "Tipos";
    }

    @Override
    public void initialize(final Bootstrap<TiposConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final TiposConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
