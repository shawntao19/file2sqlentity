package readline;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author 罗森 create 2017年10月12日上午10:16:53
 */
@Entity
@Table(name = "pm_lev1_all_real_time")
public class Lev1AllRealTime implements Serializable {

    /**
     * @return the ID
     */
    public Long getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * @return the createdDt
     */
    public String getCreatedDt() {
        return createdDt;
    }

    /**
     * @param createdDt the createdDt to set
     */
    public void setCreatedDt(String createdDt) {
        this.createdDt = createdDt;
    }

    /**
     * @return the importantArea
     */
    public String getImportantArea() {
        return importantArea;
    }

    /**
     * @param importantArea the importantArea to set
     */
    public void setImportantArea(String importantArea) {
        this.importantArea = importantArea;
    }

    /**
     * @return the province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province the province to set
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * @return the isLocal
     */
    public Integer getIsLocal() {
        return isLocal;
    }

    /**
     * @param isLocal the isLocal to set
     */
    public void setIsLocal(Integer isLocal) {
        this.isLocal = isLocal;
    }

    /**
     * @return the lng
     */
    public Double getLng() {
        return lng;
    }

    /**
     * @param lng the lng to set
     */
    public void setLng(Double lng) {
        this.lng = lng;
    }

    /**
     * @return the lat
     */
    public Double getLat() {
        return lat;
    }

    /**
     * @param lat the lat to set
     */
    public void setLat(Double lat) {
        this.lat = lat;
    }

    /**
     * @return the dataSign
     */
    public Date getDataSign() {
        return dataSign;
    }

    /**
     * @param dataSign the dataSign to set
     */
    public void setDataSign(Date dataSign) {
        this.dataSign = dataSign;
    }

    /**
     * @return the count
     */
    public Long getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 4270450247801556735L;

    @Id
    private Long ID;

    @Column(name = "created_dt")
    private String createdDt;

    @Column(name = "important_area")
    private String importantArea;

    @Column(name = "province")
    private String province;

    @Column(name = "is_local")
    private Integer isLocal;

    @Column(name = "lng")
    private Double lng;

    @Column(name = "lat")
    private Double lat;

    @Column(name = "data_sign")
    private Date dataSign;

    @Column(name = "count")
    private Long count;

}
