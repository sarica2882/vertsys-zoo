package dhbwka.wwi.vertsys.rest.zoo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

// Entität für ein Tier
@Entity
@Data
public class Tier implements Serializable {

	// Jedes Tier bekommt eine Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private long id;

    // Jedes Tier bekommt einen Namen
    @Column(length = 64)
    @Size(min = 1, max = 64, message = "Der Name muss zwischen einem und 64 Zeichen lang sein. (Beispiel: 'Löwe')")
    @NotNull(message = "Der Name darf nicht leer sein.")
    private String name = "";
    
    // Jedes Tier bekommt eine Klasse
    @Column(length = 64)
    @Size(min = 1, max = 64, message = "Die Klasse muss zwischen einem und 64 Zeichen lang sein (Beispiel: 'Säugetier').")
    @NotNull(message = "Die Klasse darf nicht leer sein.")
    private String klasse = "";
    
    // Jedes Tier bekommt einen Gefärdungsstatus
    @Column(length = 64)
    @Size(min = 1, max = 64, message = "Die Gefährdung muss zwischen einem und 64 Zeichen lang sein. (Beispiel: 'sehr gefährdet')")
    @NotNull(message = "Die Gefährdung darf nicht leer sein.")
    private String gefaehrdung = "";

    // Konstruktor
    public Tier() {
    }
}