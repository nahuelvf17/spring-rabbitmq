package com.novando.springrabbitmq;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PostDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7172776178525410305L;

	private Long id;
	
	@NotEmpty
	private String titulo;
	
	@NotEmpty
	private String contenido;
	
	private int categoriaId;

	private String imagen;
}
