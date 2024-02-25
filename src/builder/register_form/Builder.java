package builder.register_form;

import java.time.LocalDate;

public interface Builder {
	
	Builder id( int id );
	Builder createAt( LocalDate localDate );
	Builder name( String name );
	Builder email( String email );
	Builder user( String user );
	Builder password( String password );
	Form getForm();

}
