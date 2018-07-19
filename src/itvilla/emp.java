package itvilla;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class emp 
{
	@Autowired
	dept empdept;
	public emp(dept empdept) 
	{
		this.empdept = empdept;
	}
}
