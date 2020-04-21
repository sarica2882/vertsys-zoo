package dhbwka.wwi.vertsys.rest.zoo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

// Entität zur Erstellung eines Zoos (=Liste der im Zoo vorhandenen Tiere)
@Entity
@Data
public class Zoo implements Serializable {
    
	// Jeder Zoo bekommt eine Id um ihn bei Namensgleichheit eindeutig finden zu können
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private long id;
    
    @ManyToMany
    List<Tier> tiere = new ArrayList<>();

    // Jeder Zoo bekommt einen beliebigen Namen
    @Column(length = 64)
    @Size(min = 1, max = 64, message = "Der Name muss zwischen einem und 64 Zeichen lang sein. (Beispiel: 'Frankfurter Zoo')")
    @NotNull(message = "Der Name darf nicht leer sein.")
    private String name = "";
}
