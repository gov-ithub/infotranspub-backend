package ro.gov.ithub.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import ro.gov.ithub.base.BaseEntityWithId;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table
public class Agency extends BaseEntityWithId {

    static final String TABLE_NAME = "AGENCY";
    public static final String COLUMN_CITY_ID = "CITY_ID";

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String url;

    @Column(nullable = false)
    private String timezone;

    @Column
    private String lang;

    @Column
    private String phone;

    @Column
    private String fareUrl;

    @Column
    private String email;

    @OneToMany(fetch = FetchType.EAGER)
    private Set<Route> routes;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
