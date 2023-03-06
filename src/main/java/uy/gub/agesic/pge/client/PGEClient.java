package uy.gub.agesic.pge.client;


import org.apache.http.impl.client.CloseableHttpClient;
import uy.gub.agesic.pge.beans.STSResponse;
import uy.gub.agesic.pge.exceptions.RequestSecurityTokenException;
import uy.gub.agesic.pge.pojos.Configuration;
import uy.gub.agesic.pge.pojos.Connector;

/**
 * Created by adriancur on 20/10/17.
 */
public interface PGEClient {

    STSResponse requestSecurityToken(final Configuration configuration, final Connector connector,
                                     final String policyName, final String stsGlobalUrl,
                                     final CloseableHttpClient httpClient) throws RequestSecurityTokenException;
}
