package premo.gmaobackend.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

@Entity
@Table(name="trace")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reclamation {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long Id;
    private String Id_Machine;
    private String Id_Inter;
    private String Type_Inter;
    private String Nom_Shift;
    private String Descri;
    private String Type_Defaut;
    private String Id_Ligne;
    private Date Heurearr;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date Datereel;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date Date_ReelV2;
    private String Type_Tache;
    private String Id_PDR;
    private int Qteconsom;
    private String EtatP;

    private Date HeureD;

    private Date HeureF;
    private String Matinter;
    private String Observation;
    private String Typeinte;
    private String Chef_equipe;
    private String Cloture;

    @PrePersist
    private void onCreate() {
        Datereel = addHoursToJavaUtilDate(new Date(),1);
        Date_ReelV2 = addHoursToJavaUtilDate(new Date(),1);
    }

    public Date addHoursToJavaUtilDate(Date date, int hours) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR_OF_DAY, hours);
        return calendar.getTime();
    }

}
