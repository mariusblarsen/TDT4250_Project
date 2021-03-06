/**
 * generated by Xtext 2.23.0
 */
package tdt4250.ganttproject.generator;

import com.google.common.base.Objects;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.function.Consumer;
import org.eclipse.xtend2.lib.StringConcatenation;
import tdt4250.ganttproject.gpx.AbstractTask;
import tdt4250.ganttproject.gpx.DURATION_UNIT;
import tdt4250.ganttproject.gpx.Milestone;
import tdt4250.ganttproject.gpx.Project;
import tdt4250.ganttproject.gpx.Task;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class GpxCustomGenerator {
  public static String generate(final Project project) {
    StringBuilder _stringBuilder = new StringBuilder();
    return GpxCustomGenerator.generateXml(project, _stringBuilder).toString();
  }
  
  public static CharSequence generateXml(final Project project, final StringBuilder stringBuilder) {
    GpxCustomGenerator.operator_doubleLessThan(stringBuilder, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    GpxCustomGenerator.generateProject(project, stringBuilder);
    return stringBuilder;
  }
  
  public static StringBuilder operator_doubleLessThan(final StringBuilder builder, final String string) {
    return builder.append(string);
  }
  
  public static void generateProject(final Project project, final StringBuilder stringBuilder) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<project name=\"");
    String _name = project.getName();
    _builder.append(_name);
    _builder.append("\" company=\"\" webLink=\"http://\" view-date=\"2021-01-01\" view-index=\"0\" gantt-divider-location=\"367\" resource-divider-location=\"300\" version=\"2.8.11\" locale=\"en_US\">");
    StringBuilder _doubleLessThan = GpxCustomGenerator.operator_doubleLessThan(stringBuilder, _builder);
    GpxCustomGenerator.operator_doubleLessThan(_doubleLessThan, 
      "<description/>");
    GpxCustomGenerator.generateCommonPreambule(stringBuilder);
    GpxCustomGenerator.generateTasks(project, stringBuilder);
    GpxCustomGenerator.generateCommonEnding(stringBuilder);
    GpxCustomGenerator.operator_doubleLessThan(stringBuilder, "\r\n</project>");
  }
  
  public static void generateCommonPreambule(final StringBuilder stringBuilder) {
    GpxCustomGenerator.operator_doubleLessThan(stringBuilder, 
      "<view zooming-state=\"default:8\" id=\"gantt-chart\">\r\n   \t\t    <field id=\"tpd3\" name=\"Name\" width=\"204\" order=\"0\"/>\r\n\t\t\t<field id=\"tpd4\" name=\"Begin date\" width=\"80\" order=\"1\"/>\r\n\t\t\t<field id=\"tpd5\" name=\"End date\" width=\"79\" order=\"2\"/>\r\n        \t<option id=\"color.recent\">\r\n            \t<![CDATA[#00cc66 #990066 #ffffcc #990099]]>\r\n        \t</option>\r\n    \t</view>\r\n    \t<view id=\"resource-table\">\r\n        \t<field id=\"0\" name=\"Name\" width=\"210\" order=\"0\"/>\r\n\t        <field id=\"1\" name=\"Default role\" width=\"86\" order=\"1\"/>\r\n \t    </view>\r\n        <calendars>\r\n\t        <day-types>\r\n\t            <day-type id=\"0\"/>\r\n\t            <day-type id=\"1\"/>\r\n\t            <default-week id=\"1\" name=\"default\" sun=\"1\" mon=\"0\" tue=\"0\" wed=\"0\" thu=\"0\" fri=\"0\" sat=\"1\"/>\r\n\t            <only-show-weekends value=\"false\"/>\r\n\t            <overriden-day-types/>\r\n\t            <days/>\r\n\t        </day-types>\r\n\t    </calendars>");
  }
  
  public static void generateTasks(final Project project, final StringBuilder stringBuilder) {
    GpxCustomGenerator.operator_doubleLessThan(stringBuilder, 
      "<tasks empty-milestones=\"true\">\r\n        <taskproperties>\r\n            <taskproperty id=\"tpd0\" name=\"type\" type=\"default\" valuetype=\"icon\"/>\r\n            <taskproperty id=\"tpd1\" name=\"priority\" type=\"default\" valuetype=\"icon\"/>\r\n            <taskproperty id=\"tpd2\" name=\"info\" type=\"default\" valuetype=\"icon\"/>\r\n            <taskproperty id=\"tpd3\" name=\"name\" type=\"default\" valuetype=\"text\"/>\r\n            <taskproperty id=\"tpd4\" name=\"begindate\" type=\"default\" valuetype=\"date\"/>\r\n            <taskproperty id=\"tpd5\" name=\"enddate\" type=\"default\" valuetype=\"date\"/>\r\n            <taskproperty id=\"tpd6\" name=\"duration\" type=\"default\" valuetype=\"int\"/>\r\n            <taskproperty id=\"tpd7\" name=\"completion\" type=\"default\" valuetype=\"int\"/>\r\n            <taskproperty id=\"tpd8\" name=\"coordinator\" type=\"default\" valuetype=\"text\"/>\r\n            <taskproperty id=\"tpd9\" name=\"predecessorsr\" type=\"default\" valuetype=\"text\"/>\r\n        </taskproperties>\r\n");
    final Consumer<AbstractTask> _function = (AbstractTask it) -> {
      GpxCustomGenerator.generateTask(it, stringBuilder);
    };
    project.getTasks().forEach(_function);
    GpxCustomGenerator.operator_doubleLessThan(stringBuilder, 
      "</tasks>");
  }
  
  protected static void _generateTask(final Milestone task, final StringBuilder stringBuilder) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<task id=\"");
    int _id = task.getId();
    _builder.append(_id);
    _builder.append("\" name=\"");
    String _name = task.getName();
    _builder.append(_name);
    _builder.append("\" color=\"#990066\" meeting=\"true\" start=\"");
    Object _xifexpression = null;
    Date _endDate = task.getEndDate();
    boolean _notEquals = (!Objects.equal(_endDate, null));
    if (_notEquals) {
      _xifexpression = GpxCustomGenerator.convertDate(task.getEndDate());
    } else {
      _xifexpression = Integer.valueOf(0);
    }
    _builder.append(_xifexpression);
    _builder.append("\" duration=\"0\" complete=\"0\" thirdDate=\"");
    Object _xifexpression_1 = null;
    Date _endDate_1 = task.getEndDate();
    boolean _notEquals_1 = (!Objects.equal(_endDate_1, null));
    if (_notEquals_1) {
      _xifexpression_1 = GpxCustomGenerator.convertDate(task.getEndDate());
    } else {
      _xifexpression_1 = Integer.valueOf(0);
    }
    _builder.append(_xifexpression_1);
    _builder.append("\" thirdDate-constraint=\"0\" expand=\"true\">");
    _builder.newLineIfNotEmpty();
    GpxCustomGenerator.operator_doubleLessThan(stringBuilder, _builder);
    GpxCustomGenerator.operator_doubleLessThan(stringBuilder, "\r\n\t\t\t</task>");
  }
  
  protected static void _generateTask(final Task task, final StringBuilder stringBuilder) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<task id=\"");
    int _id = task.getId();
    _builder.append(_id);
    _builder.append("\" name=\"");
    String _name = task.getName();
    _builder.append(_name);
    _builder.append("\" color=\"#990066\" meeting=\"false\" start=\"");
    Object _xifexpression = null;
    Date _endDate = task.getEndDate();
    boolean _notEquals = (!Objects.equal(_endDate, null));
    if (_notEquals) {
      _xifexpression = GpxCustomGenerator.convertDate(task.getStartDate());
    } else {
      _xifexpression = Integer.valueOf(0);
    }
    _builder.append(_xifexpression);
    _builder.append("\" duration=\"");
    int _adjustDurationToDays = GpxCustomGenerator.adjustDurationToDays(task);
    _builder.append(_adjustDurationToDays);
    _builder.append("\" complete=\"0\" thirdDate=\"");
    Object _xifexpression_1 = null;
    Date _endDate_1 = task.getEndDate();
    boolean _notEquals_1 = (!Objects.equal(_endDate_1, null));
    if (_notEquals_1) {
      _xifexpression_1 = GpxCustomGenerator.convertDate(task.getEndDate());
    } else {
      _xifexpression_1 = Integer.valueOf(0);
    }
    _builder.append(_xifexpression_1);
    _builder.append("\" thirdDate-constraint=\"0\" expand=\"true\">");
    _builder.newLineIfNotEmpty();
    GpxCustomGenerator.operator_doubleLessThan(stringBuilder, _builder);
    final Consumer<AbstractTask> _function = (AbstractTask it) -> {
      GpxCustomGenerator.generateTask(it, stringBuilder);
    };
    task.getSubtasks().forEach(_function);
    GpxCustomGenerator.operator_doubleLessThan(stringBuilder, "\r\n\t\t\t</task>");
  }
  
  public static int adjustDurationToDays(final Task t) {
    int _xifexpression = (int) 0;
    DURATION_UNIT _durationUnit = t.getDurationUnit();
    boolean _equals = Objects.equal(_durationUnit, DURATION_UNIT.WEEK);
    if (_equals) {
      int _duration = t.getDuration();
      _xifexpression = (_duration * 7);
    } else {
      _xifexpression = t.getDuration();
    }
    return _xifexpression;
  }
  
  public static void generateCommonEnding(final StringBuilder stringBuilder) {
    GpxCustomGenerator.operator_doubleLessThan(stringBuilder, 
      "<resources/>\r\n\t\t<allocations/>\r\n\t\t<vacations/>\r\n\t\t<previous/>\r\n\t\t<roles roleset-name=\"Default\"/>");
  }
  
  public static StringBuilder operator_doubleLessThan(final StringBuilder stringBuilder, final Object o) {
    return stringBuilder.append(o);
  }
  
  public static String convertDate(final Date date) {
    final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    return dateFormat.format(date);
  }
  
  public static void generateTask(final AbstractTask task, final StringBuilder stringBuilder) {
    if (task instanceof Milestone) {
      _generateTask((Milestone)task, stringBuilder);
      return;
    } else if (task instanceof Task) {
      _generateTask((Task)task, stringBuilder);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(task, stringBuilder).toString());
    }
  }
}
