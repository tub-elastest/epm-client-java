/*
 * EPM REST API
 * REST API description of the ElasTest Platform Manager Module.
 *
 * OpenAPI spec version: 0.1.2
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.elastest.epm.client.api;

import io.elastest.epm.client.ApiException;
import io.elastest.epm.client.model.VDU;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;

/** API tests for VDUApi */
@Ignore
public class VDUApiTest {

  private final VDUApi api = new VDUApi();

  /**
   * Terminates a VDU.
   *
   * <p>Terminates the VDU that matches with a given ID.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteVduTest() throws ApiException {
    String id = null;
    String response = api.deleteVdu(id);

    // TODO: test validations
  }

  /**
   * Allocates resources in the target cloud.
   *
   * <p>Allocates resources defined as a VDU in the cloud to be deployed in the target cloud
   * environment. It instantiates computing resources, deploys artifacts on them and manages the
   * their lifecycle
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deployVduTest() throws ApiException {
    VDU body = null;
    VDU response = api.deployVdu(body);

    // TODO: test validations
  }

  /**
   * Returns all VDUs.
   *
   * <p>Returns all VDUs with all its details.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getAllVdusTest() throws ApiException {
    List<VDU> response = api.getAllVdus();

    // TODO: test validations
  }

  /**
   * Returns a VDU.
   *
   * <p>Returns the VDU with the given ID. Returns all its details.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getVduByIdTest() throws ApiException {
    String id = null;
    VDU response = api.getVduById(id);

    // TODO: test validations
  }

  /**
   * Updates a VDU.
   *
   * <p>Updates an already deployed VDU.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void updateVduTest() throws ApiException {
    String id = null;
    VDU body = null;
    VDU response = api.updateVdu(id, body);

    // TODO: test validations
  }
}
