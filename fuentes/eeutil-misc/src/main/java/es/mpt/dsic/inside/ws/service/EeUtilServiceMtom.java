/*
 * Copyright (C) 2012-13 MINHAP, Gobierno de España This program is licensed and may be used,
 * modified and redistributed under the terms of the European Public License (EUPL), either version
 * 1.1 or (at your option) any later version as soon as they are approved by the European
 * Commission. Unless required by applicable law or agreed to in writing, software distributed under
 * the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions and
 * more details. You should have received a copy of the EUPL1.1 license along with this program; if
 * not, you may find it at http://joinup.ec.europa.eu/software/page/eupl/licence-eupl
 */

package es.mpt.dsic.inside.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;
import es.mpt.dsic.inside.security.model.ApplicationLogin;
import es.mpt.dsic.inside.ws.service.exception.InSideException;
import es.mpt.dsic.inside.ws.service.model.pdf.DocumentoEntradaMtom;
import es.mpt.dsic.inside.ws.service.model.pdf.PdfSalidaMtom;

@WebService
@BindingType(SOAPBinding.SOAP11HTTP_MTOM_BINDING)
public interface EeUtilServiceMtom {

  @WebMethod(operationName = "comprobarPDFA", action = "urn:comprobarPDFA")
  @WebResult(name = "esPdfA", partName = "esPdfA")
  public Boolean comprobarPDFA(
      @WebParam(name = "aplicacionInfo") @XmlElement(required = true,
          name = "aplicacionInfo") ApplicationLogin info,
      @WebParam(name = "DocumentoEntradaMtom") @XmlElement(required = true,
          name = "DocumentoEntradaMtom") DocumentoEntradaMtom docEntrada,
      @XmlElement(required = false, name = "nivelCompilacion") Integer nivelCompilacion)
      throws InSideException;

  @WebMethod(operationName = "convertirPDFA", action = "urn:convertirPDFA")
  @WebResult(name = "PdfSalidaMtom", partName = "PdfSalidaMtom")
  public PdfSalidaMtom convertirPDFA(
      @WebParam(name = "aplicacionInfo") @XmlElement(required = true,
          name = "aplicacionInfo") ApplicationLogin info,
      @WebParam(name = "DocumentoEntradaMtom") @XmlElement(required = true,
          name = "DocumentoEntradaMtom") DocumentoEntradaMtom docEntrada,
      @XmlElement(required = false, name = "nivelCompilacion") Integer nivelCompilacion)
      throws InSideException;

}
