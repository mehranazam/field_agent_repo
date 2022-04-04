package learn.field_agent.data;

import learn.field_agent.models.Alias;

import java.util.List;

public interface AliasRepository {

    Alias findById(int aliasId);

    Alias add(Alias alias);

    boolean update(Alias alias);

    boolean deleteById(int aliasId);

    List<Alias> getAliasesByAgentId(int agentId);

    List<Alias> getAliasesByName(String name);
}
