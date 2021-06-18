package uy.gub.agesic.empresa.ws;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import uy.gub.agesic.empresa.model.ide.GeocodeResult;
import uy.gub.agesic.empresa.model.ide.GeocodeResultVO;

@FeignClient(name = "data", url = "${ide.direcciones.uri}") 
public interface IDE_DireccionesClient {

	    @RequestMapping(method = RequestMethod.GET, path = "/api/v1/geocode/direcUnica")
	    GeocodeResult[] direccionUnica(@RequestParam("limit") int limit,
	                       @RequestParam("q") String query);
	    
	    @RequestMapping(method = RequestMethod.GET, path = "/api/v0/geocode/BusquedaDireccion")
	    GeocodeResultVO[] busquedaDireccion(@RequestParam("calle") String calle,
	                       @RequestParam("departamento") String departamento, @RequestParam("localidad") String localidad);

}