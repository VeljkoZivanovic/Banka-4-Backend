package rs.edu.raf.transakcija.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import rs.edu.raf.korisnik.model.Korisnik;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class SablonTransakcije {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



}
