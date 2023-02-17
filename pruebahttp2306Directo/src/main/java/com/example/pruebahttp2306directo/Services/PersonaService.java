package com.example.pruebahttp2306directo.Services;

import com.example.pruebahttp2306directo.modelo.Contrato;
import com.example.pruebahttp2306directo.modelo.Persona;
import com.example.pruebahttp2306directo.modelo.SocioDTO;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonaService {

    public Optional<Persona> findPErsonaById(Long id){
        return  Optional.of(Persona.builder().nombre("jhon").apellidos("wayne martines").contrato(new Contrato("45f456",45.56f)).build());
    }

    public SocioDTO findPersonaById(Long id){
        Persona build = Persona.builder().nombre("jhon").apellidos("wayne martines").contrato(new Contrato("45f456", 45.56f)).build();
        SocioDTO socioDTO = new SocioDTO(build.getNombre(), build.getApellidos());
        return socioDTO;
    }
}
