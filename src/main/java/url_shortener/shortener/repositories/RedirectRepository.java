package url_shortener.shortener.repositories;

import org.springframework.stereotype.Repository;

import url_shortener.shortener.entities.Redirection;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface RedirectRepository extends CrudRepository<Redirection, String> {
}
