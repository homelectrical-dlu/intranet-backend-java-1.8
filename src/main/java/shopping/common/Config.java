package shopping.common;

import com.google.api.client.json.GenericJson;

import java.io.File;

/**
 * Base class for configuration objects handled by DataStores for the two APIs.
 *
 * <p>The Authenticator and ConfigDataStoreFactory classes need access to the emailAddress used for
 * authentication. The ConfigDataStoreFactory class also needs access to the token and the ability
 * to save the configuration.
 */

public abstract class Config extends GenericJson {

    private File path;

    public File getPath() {
        return path;
    }

    public void setPath(File path) {
        this.path = path;
    }
}
