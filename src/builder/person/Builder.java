package builder.person;

import java.time.LocalDate;

public interface Builder {
	
	Builder id( int id );
	Builder name( String name );
	Builder yearsOld( int yearsOld );
	Builder gender( String gender );
	Builder dateAdmission( LocalDate dateAdmission );
	Person getPerson();
	

}
