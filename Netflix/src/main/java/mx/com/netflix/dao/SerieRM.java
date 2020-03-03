package mx.com.netflix.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import mx.com.netflix.models.Series;

public class SerieRM implements RowMapper<Series> {
@Override
public Series mapRow(ResultSet rs,int rowNum)throws SQLException{
Series series= new Series();
series.setId(rs.getInt("id"));
series.setNombre(rs.getString("nombre"));
series.setDescripcion(rs.getString("descripcion"));
series.setAnio(rs.getInt("anio"));
series.setClasificacion(rs.getString("clasificacion"));
series.setCategoria(rs.getString("categoria"));
return series;

}
}
