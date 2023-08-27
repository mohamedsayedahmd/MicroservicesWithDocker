package com.taxservice.taxservice.repo;

import com.basedomain.basedomain.dto.ItemEvent;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.data.couchbase.repository.Scope;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxRepo extends CouchbaseRepository<ItemEvent,String> {
}
