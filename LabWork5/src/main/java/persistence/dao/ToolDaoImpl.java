package persistence.dao;

import java.io.Serializable;

import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.tools.Tool;

@Named
@Dependent
public class ToolDaoImpl extends AbstractDao<Tool> implements ToolDao, Serializable {
    private static final long serialVersionUID = 1L;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    protected Class<Tool> getEntityClass() {
        return Tool.class;
    }
}
