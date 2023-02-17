package com.example.pruebahttp2306directo.modelo;

public class ContratoDetailDTOMapper implements Mapper<ContratoDetailDTO,Persona>{
    @Override
    public ContratoDetailDTO map(Persona persona) {
        return new ContratoDetailDTO(persona.getNombre(),persona.getApellidos(),persona.getContrato().getReferencia());
    }
}
