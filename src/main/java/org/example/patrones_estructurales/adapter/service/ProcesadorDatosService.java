package org.example.patrones_estructurales.adapter.service;

import java.util.List;

public interface ProcesadorDatosService<T> {
    List<T> getProcessDataList(String data);
    T getProcessData(String data);
}
