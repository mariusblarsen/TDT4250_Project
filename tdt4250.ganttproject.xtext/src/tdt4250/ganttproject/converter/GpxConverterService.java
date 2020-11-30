package tdt4250.ganttproject.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractNullSafeConverter;
import org.eclipse.xtext.nodemodel.INode;

public class GpxConverterService extends DefaultTerminalConverters {
	
	@ValueConverter(rule = "Date")
	public IValueConverter<Date> Date() {
		return new AbstractNullSafeConverter<Date>() {

			@Override
			protected String internalToString(Date value) {
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yy");
				return '"' + dateFormat.format(value) + '"';
			}

			@Override
			protected Date internalToValue(String string, INode node) throws ValueConverterException {
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yy");
				Date result = null;
				try {
					result = dateFormat.parse(string);
				} catch (ParseException e) {
					throw new ValueConverterException("Invalid date format: use 'dd.mm.yy'. Parsing error: " + e.getMessage(), node, e);
				}
				return result;
			}
		};
	}

}