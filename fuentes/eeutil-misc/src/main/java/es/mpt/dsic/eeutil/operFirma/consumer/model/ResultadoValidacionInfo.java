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


package es.mpt.dsic.eeutil.operFirma.consumer.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Clase Java para ResultadoValidacionInfo complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResultadoValidacionInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="detalle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultadoValidacionInfo", propOrder = {"estado", "detalle"})
public class ResultadoValidacionInfo {

  protected boolean estado;
  @XmlElement(required = true)
  protected String detalle;

  /**
   * Obtiene el valor de la propiedad estado.
   * 
   */
  public boolean isEstado() {
    return estado;
  }

  /**
   * Define el valor de la propiedad estado.
   * 
   */
  public void setEstado(boolean value) {
    this.estado = value;
  }

  /**
   * Obtiene el valor de la propiedad detalle.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getDetalle() {
    return detalle;
  }

  /**
   * Define el valor de la propiedad detalle.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setDetalle(String value) {
    this.detalle = value;
  }

}
