package uz.pdp.backend.service;

public interface BaseService<M> {
    boolean create(M m);
    void delete(String id);
    void update(M newM);
    M get(String id);
}
