package com.microservice.cinemavip.models.payload;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Responses {

    public Map<String, Object> getNoContentResponseById(String entityName, int id) {
        Map<String, Object> fields = new HashMap<>();
        fields.put("error", "No se encontro " + entityName + " con el ID: " + id + ".");
        return fields;
    }

    public Map<String, Object> getNoContentResponseListAll(String entityName) {
        Map<String, Object> fields = new HashMap<>();
        fields.put("error", "No se encontraron " + entityName + "s disponibles.");
        return fields;
    }

    public Map<String, Object> getContentResponsePurchase() {
        Map<String, Object> fields = new HashMap<>();
        fields.put("response", "Compra realizada con exito");
        return fields;
    }

    public Map<String, Object> getPurchaseResponseNotValidSeatsReserved() {
        Map<String, Object> fields = new HashMap<>();
        fields.put("response", "Los puestos ya han sido reservados");
        return fields;
    }

    public Map<String, Object> getPurchaseResponseNotValidShowtimeHour() {
        Map<String, Object> fields = new HashMap<>();
        fields.put("response", "La tanda ya no esta disponible");
        return fields;
    }

    public Map<String, Object> getNoTicketsUser() {
        Map<String, Object> fields = new HashMap<>();
        fields.put("response", "El usuario no ha comprado tickets");
        return fields;
    }
}
