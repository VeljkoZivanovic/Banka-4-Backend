package rs.edu.raf.racun.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Firma {

    @Id
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private Long id;

    public Firma(String nazivPreduzeca, String povezaniRacuni, String brojTelefona, String brojFaksa, Integer PIB, Integer maticniBroj, Integer sifraDelatnosti, Integer registarskiBroj) {
        this.nazivPreduzeca = nazivPreduzeca;
        this.povezaniRacuni = povezaniRacuni;
        this.brojTelefona = brojTelefona;
        this.brojFaksa = brojFaksa;
        this.PIB = PIB;
        this.maticniBroj = maticniBroj;
        this.sifraDelatnosti = sifraDelatnosti;
        this.registarskiBroj = registarskiBroj;
    }

    @NotBlank
    private String nazivPreduzeca;

    private String povezaniRacuni; //BrojRacuna

    @NotBlank
    private String brojTelefona;

    @NotBlank
    private String brojFaksa;

    @NotNull
    private Integer PIB;

    @NotNull
    private Integer maticniBroj;

    @NotNull
    private Integer sifraDelatnosti;

    @NotNull
    private Integer registarskiBroj;
}
