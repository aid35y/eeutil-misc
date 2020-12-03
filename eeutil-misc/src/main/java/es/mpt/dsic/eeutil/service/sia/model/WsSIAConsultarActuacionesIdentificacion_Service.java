/* Copyright (C) 2012-13 MINHAP, Gobierno de España
   This program is licensed and may be used, modified and redistributed under the terms
   of the European Public License (EUPL), either version 1.1 or (at your
   option) any later version as soon as they are approved by the European Commission.
   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
   or implied. See the License for the specific language governing permissions and
   more details.
   You should have received a copy of the EUPL1.1 license
   along with this program; if not, you may find it at
   http://joinup.ec.europa.eu/software/page/eupl/licence-eupl */

package es.mpt.dsic.eeutil.service.sia.model;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.3
 * 2016-09-28T15:00:53.376+02:00
 * Generated source version: 3.0.3
 * 
 */
@WebServiceClient(name = "wsSIAConsultarActuacionesIdentificacion", 
                  wsdlLocation = "http://sia2.redsara.es/axis2/services/wsSIAConsultarActuacionesIdentificacion?wsdl",
                  targetNamespace = "http://www.map.es/sgca/consultar") 
public class WsSIAConsultarActuacionesIdentificacion_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.map.es/sgca/consultar", "wsSIAConsultarActuacionesIdentificacion");
    public final static QName WsSIAConsultarActuacionesIdentificacionSOAP = new QName("http://www.map.es/sgca/consultar", "wsSIAConsultarActuacionesIdentificacionSOAP");
    static {
        URL url = null;
        try {
            url = new URL("http://sia2.redsara.es/axis2/services/wsSIAConsultarActuacionesIdentificacion?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(WsSIAConsultarActuacionesIdentificacion_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://sia2.redsara.es/axis2/services/wsSIAConsultarActuacionesIdentificacion?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public WsSIAConsultarActuacionesIdentificacion_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WsSIAConsultarActuacionesIdentificacion_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsSIAConsultarActuacionesIdentificacion_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public WsSIAConsultarActuacionesIdentificacion_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public WsSIAConsultarActuacionesIdentificacion_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public WsSIAConsultarActuacionesIdentificacion_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns WsSIAConsultarActuacionesIdentificacion
     */
    @WebEndpoint(name = "wsSIAConsultarActuacionesIdentificacionSOAP")
    public WsSIAConsultarActuacionesIdentificacion getWsSIAConsultarActuacionesIdentificacionSOAP() {
        return super.getPort(WsSIAConsultarActuacionesIdentificacionSOAP, WsSIAConsultarActuacionesIdentificacion.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WsSIAConsultarActuacionesIdentificacion
     */
    @WebEndpoint(name = "wsSIAConsultarActuacionesIdentificacionSOAP")
    public WsSIAConsultarActuacionesIdentificacion getWsSIAConsultarActuacionesIdentificacionSOAP(WebServiceFeature... features) {
        return super.getPort(WsSIAConsultarActuacionesIdentificacionSOAP, WsSIAConsultarActuacionesIdentificacion.class, features);
    }

}
