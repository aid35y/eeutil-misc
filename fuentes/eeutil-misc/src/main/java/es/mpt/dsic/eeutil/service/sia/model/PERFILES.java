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


package es.mpt.dsic.eeutil.service.sia.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Clase Java para PERFILES complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PERFILES">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PERFIL" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CODTIPOPERFIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DESTIPOPERFIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PERFILES", namespace = "http://www.map.es/sgca/consultar/messages/v2_4/EnviaSIA",
    propOrder = {"perfil"})
public class PERFILES {

  @XmlElement(name = "PERFIL")
  protected List<PERFILES.PERFIL> perfil;

  /**
   * Gets the value of the perfil property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the perfil property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
   * getPERFIL().add(newItem);
   * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link PERFILES.PERFIL }
   * 
   * 
   */
  public List<PERFILES.PERFIL> getPERFIL() {
    if (perfil == null) {
      perfil = new ArrayList<PERFILES.PERFIL>();
    }
    return this.perfil;
  }


  /**
   * <p>
   * Clase Java para anonymous complex type.
   * 
   * <p>
   * El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
   * 
   * <pre>
   * &lt;complexType>
   *   &lt;complexContent>
   *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *       &lt;sequence>
   *         &lt;element name="CODTIPOPERFIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
   *         &lt;element name="DESTIPOPERFIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
   *       &lt;/sequence>
   *     &lt;/restriction>
   *   &lt;/complexContent>
   * &lt;/complexType>
   * </pre>
   * 
   * 
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {"codtipoperfil", "destipoperfil"})
  public static class PERFIL {

    @XmlElement(name = "CODTIPOPERFIL",
        namespace = "http://www.map.es/sgca/consultar/messages/v2_4/EnviaSIA")
    protected String codtipoperfil;
    @XmlElement(name = "DESTIPOPERFIL",
        namespace = "http://www.map.es/sgca/consultar/messages/v2_4/EnviaSIA")
    protected String destipoperfil;

    /**
     * Obtiene el valor de la propiedad codtipoperfil.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCODTIPOPERFIL() {
      return codtipoperfil;
    }

    /**
     * Define el valor de la propiedad codtipoperfil.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setCODTIPOPERFIL(String value) {
      this.codtipoperfil = value;
    }

    /**
     * Obtiene el valor de la propiedad destipoperfil.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDESTIPOPERFIL() {
      return destipoperfil;
    }

    /**
     * Define el valor de la propiedad destipoperfil.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setDESTIPOPERFIL(String value) {
      this.destipoperfil = value;
    }

  }

}
