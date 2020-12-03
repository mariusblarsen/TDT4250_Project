package tdt4250.ganttproject.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import tdt4250.ganttproject.services.GpxGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGpxParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Project'", "';'", "'Task'", "'lasts'", "'from'", "'due'", "','", "'depends'", "'on'", "'{'", "'}'", "'Milestone'", "'planned'", "'.'", "'day'", "'days'", "'week'", "'weeks'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGpxParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGpxParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGpxParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGpx.g"; }



     	private GpxGrammarAccess grammarAccess;

        public InternalGpxParser(TokenStream input, GpxGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Project";
       	}

       	@Override
       	protected GpxGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProject"
    // InternalGpx.g:65:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // InternalGpx.g:65:48: (iv_ruleProject= ruleProject EOF )
            // InternalGpx.g:66:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalGpx.g:72:1: ruleProject returns [EObject current=null] : (otherlv_0= 'Project' ( (lv_name_1_0= RULE_STRING ) ) ( ( (lv_tasks_2_0= ruleAbstractTask ) ) (otherlv_3= ';' ( (lv_tasks_4_0= ruleAbstractTask ) ) )* )? ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_tasks_2_0 = null;

        EObject lv_tasks_4_0 = null;



        	enterRule();

        try {
            // InternalGpx.g:78:2: ( (otherlv_0= 'Project' ( (lv_name_1_0= RULE_STRING ) ) ( ( (lv_tasks_2_0= ruleAbstractTask ) ) (otherlv_3= ';' ( (lv_tasks_4_0= ruleAbstractTask ) ) )* )? ) )
            // InternalGpx.g:79:2: (otherlv_0= 'Project' ( (lv_name_1_0= RULE_STRING ) ) ( ( (lv_tasks_2_0= ruleAbstractTask ) ) (otherlv_3= ';' ( (lv_tasks_4_0= ruleAbstractTask ) ) )* )? )
            {
            // InternalGpx.g:79:2: (otherlv_0= 'Project' ( (lv_name_1_0= RULE_STRING ) ) ( ( (lv_tasks_2_0= ruleAbstractTask ) ) (otherlv_3= ';' ( (lv_tasks_4_0= ruleAbstractTask ) ) )* )? )
            // InternalGpx.g:80:3: otherlv_0= 'Project' ( (lv_name_1_0= RULE_STRING ) ) ( ( (lv_tasks_2_0= ruleAbstractTask ) ) (otherlv_3= ';' ( (lv_tasks_4_0= ruleAbstractTask ) ) )* )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProjectAccess().getProjectKeyword_0());
            		
            // InternalGpx.g:84:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalGpx.g:85:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalGpx.g:85:4: (lv_name_1_0= RULE_STRING )
            // InternalGpx.g:86:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProjectAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalGpx.g:102:3: ( ( (lv_tasks_2_0= ruleAbstractTask ) ) (otherlv_3= ';' ( (lv_tasks_4_0= ruleAbstractTask ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13||LA2_0==22) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGpx.g:103:4: ( (lv_tasks_2_0= ruleAbstractTask ) ) (otherlv_3= ';' ( (lv_tasks_4_0= ruleAbstractTask ) ) )*
                    {
                    // InternalGpx.g:103:4: ( (lv_tasks_2_0= ruleAbstractTask ) )
                    // InternalGpx.g:104:5: (lv_tasks_2_0= ruleAbstractTask )
                    {
                    // InternalGpx.g:104:5: (lv_tasks_2_0= ruleAbstractTask )
                    // InternalGpx.g:105:6: lv_tasks_2_0= ruleAbstractTask
                    {

                    						newCompositeNode(grammarAccess.getProjectAccess().getTasksAbstractTaskParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_tasks_2_0=ruleAbstractTask();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProjectRule());
                    						}
                    						add(
                    							current,
                    							"tasks",
                    							lv_tasks_2_0,
                    							"tdt4250.ganttproject.Gpx.AbstractTask");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGpx.g:122:4: (otherlv_3= ';' ( (lv_tasks_4_0= ruleAbstractTask ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==12) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalGpx.g:123:5: otherlv_3= ';' ( (lv_tasks_4_0= ruleAbstractTask ) )
                    	    {
                    	    otherlv_3=(Token)match(input,12,FOLLOW_6); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getProjectAccess().getSemicolonKeyword_2_1_0());
                    	    				
                    	    // InternalGpx.g:127:5: ( (lv_tasks_4_0= ruleAbstractTask ) )
                    	    // InternalGpx.g:128:6: (lv_tasks_4_0= ruleAbstractTask )
                    	    {
                    	    // InternalGpx.g:128:6: (lv_tasks_4_0= ruleAbstractTask )
                    	    // InternalGpx.g:129:7: lv_tasks_4_0= ruleAbstractTask
                    	    {

                    	    							newCompositeNode(grammarAccess.getProjectAccess().getTasksAbstractTaskParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_tasks_4_0=ruleAbstractTask();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProjectRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"tasks",
                    	    								lv_tasks_4_0,
                    	    								"tdt4250.ganttproject.Gpx.AbstractTask");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleAbstractTask"
    // InternalGpx.g:152:1: entryRuleAbstractTask returns [EObject current=null] : iv_ruleAbstractTask= ruleAbstractTask EOF ;
    public final EObject entryRuleAbstractTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractTask = null;


        try {
            // InternalGpx.g:152:53: (iv_ruleAbstractTask= ruleAbstractTask EOF )
            // InternalGpx.g:153:2: iv_ruleAbstractTask= ruleAbstractTask EOF
            {
             newCompositeNode(grammarAccess.getAbstractTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractTask=ruleAbstractTask();

            state._fsp--;

             current =iv_ruleAbstractTask; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractTask"


    // $ANTLR start "ruleAbstractTask"
    // InternalGpx.g:159:1: ruleAbstractTask returns [EObject current=null] : (this_Task_0= ruleTask | this_Milestone_1= ruleMilestone ) ;
    public final EObject ruleAbstractTask() throws RecognitionException {
        EObject current = null;

        EObject this_Task_0 = null;

        EObject this_Milestone_1 = null;



        	enterRule();

        try {
            // InternalGpx.g:165:2: ( (this_Task_0= ruleTask | this_Milestone_1= ruleMilestone ) )
            // InternalGpx.g:166:2: (this_Task_0= ruleTask | this_Milestone_1= ruleMilestone )
            {
            // InternalGpx.g:166:2: (this_Task_0= ruleTask | this_Milestone_1= ruleMilestone )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==22) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGpx.g:167:3: this_Task_0= ruleTask
                    {

                    			newCompositeNode(grammarAccess.getAbstractTaskAccess().getTaskParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Task_0=ruleTask();

                    state._fsp--;


                    			current = this_Task_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGpx.g:176:3: this_Milestone_1= ruleMilestone
                    {

                    			newCompositeNode(grammarAccess.getAbstractTaskAccess().getMilestoneParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Milestone_1=ruleMilestone();

                    state._fsp--;


                    			current = this_Milestone_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractTask"


    // $ANTLR start "entryRuleTask"
    // InternalGpx.g:188:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalGpx.g:188:45: (iv_ruleTask= ruleTask EOF )
            // InternalGpx.g:189:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalGpx.g:195:1: ruleTask returns [EObject current=null] : (otherlv_0= 'Task' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'lasts' ( (lv_duration_3_0= RULE_INT ) ) ( (lv_durationUnit_4_0= ruleDURATION_UNIT ) ) )? (otherlv_5= 'from' ( (lv_startDate_6_0= ruleDate ) ) )? (otherlv_7= 'due' ( (lv_endDate_8_0= ruleDate ) ) )? ( (otherlv_9= ',' )? otherlv_10= 'depends' otherlv_11= 'on' ( (lv_dependency_12_0= ruleDependency ) ) )? (otherlv_13= '{' ( (lv_subtasks_14_0= ruleAbstractTask ) ) (otherlv_15= ';' ( (lv_subtasks_16_0= ruleAbstractTask ) ) )* otherlv_17= '}' )? ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_duration_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Enumerator lv_durationUnit_4_0 = null;

        AntlrDatatypeRuleToken lv_startDate_6_0 = null;

        AntlrDatatypeRuleToken lv_endDate_8_0 = null;

        EObject lv_dependency_12_0 = null;

        EObject lv_subtasks_14_0 = null;

        EObject lv_subtasks_16_0 = null;



        	enterRule();

        try {
            // InternalGpx.g:201:2: ( (otherlv_0= 'Task' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'lasts' ( (lv_duration_3_0= RULE_INT ) ) ( (lv_durationUnit_4_0= ruleDURATION_UNIT ) ) )? (otherlv_5= 'from' ( (lv_startDate_6_0= ruleDate ) ) )? (otherlv_7= 'due' ( (lv_endDate_8_0= ruleDate ) ) )? ( (otherlv_9= ',' )? otherlv_10= 'depends' otherlv_11= 'on' ( (lv_dependency_12_0= ruleDependency ) ) )? (otherlv_13= '{' ( (lv_subtasks_14_0= ruleAbstractTask ) ) (otherlv_15= ';' ( (lv_subtasks_16_0= ruleAbstractTask ) ) )* otherlv_17= '}' )? ) )
            // InternalGpx.g:202:2: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'lasts' ( (lv_duration_3_0= RULE_INT ) ) ( (lv_durationUnit_4_0= ruleDURATION_UNIT ) ) )? (otherlv_5= 'from' ( (lv_startDate_6_0= ruleDate ) ) )? (otherlv_7= 'due' ( (lv_endDate_8_0= ruleDate ) ) )? ( (otherlv_9= ',' )? otherlv_10= 'depends' otherlv_11= 'on' ( (lv_dependency_12_0= ruleDependency ) ) )? (otherlv_13= '{' ( (lv_subtasks_14_0= ruleAbstractTask ) ) (otherlv_15= ';' ( (lv_subtasks_16_0= ruleAbstractTask ) ) )* otherlv_17= '}' )? )
            {
            // InternalGpx.g:202:2: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'lasts' ( (lv_duration_3_0= RULE_INT ) ) ( (lv_durationUnit_4_0= ruleDURATION_UNIT ) ) )? (otherlv_5= 'from' ( (lv_startDate_6_0= ruleDate ) ) )? (otherlv_7= 'due' ( (lv_endDate_8_0= ruleDate ) ) )? ( (otherlv_9= ',' )? otherlv_10= 'depends' otherlv_11= 'on' ( (lv_dependency_12_0= ruleDependency ) ) )? (otherlv_13= '{' ( (lv_subtasks_14_0= ruleAbstractTask ) ) (otherlv_15= ';' ( (lv_subtasks_16_0= ruleAbstractTask ) ) )* otherlv_17= '}' )? )
            // InternalGpx.g:203:3: otherlv_0= 'Task' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'lasts' ( (lv_duration_3_0= RULE_INT ) ) ( (lv_durationUnit_4_0= ruleDURATION_UNIT ) ) )? (otherlv_5= 'from' ( (lv_startDate_6_0= ruleDate ) ) )? (otherlv_7= 'due' ( (lv_endDate_8_0= ruleDate ) ) )? ( (otherlv_9= ',' )? otherlv_10= 'depends' otherlv_11= 'on' ( (lv_dependency_12_0= ruleDependency ) ) )? (otherlv_13= '{' ( (lv_subtasks_14_0= ruleAbstractTask ) ) (otherlv_15= ';' ( (lv_subtasks_16_0= ruleAbstractTask ) ) )* otherlv_17= '}' )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
            		
            // InternalGpx.g:207:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalGpx.g:208:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalGpx.g:208:4: (lv_name_1_0= RULE_STRING )
            // InternalGpx.g:209:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTaskAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalGpx.g:225:3: (otherlv_2= 'lasts' ( (lv_duration_3_0= RULE_INT ) ) ( (lv_durationUnit_4_0= ruleDURATION_UNIT ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGpx.g:226:4: otherlv_2= 'lasts' ( (lv_duration_3_0= RULE_INT ) ) ( (lv_durationUnit_4_0= ruleDURATION_UNIT ) )
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getLastsKeyword_2_0());
                    			
                    // InternalGpx.g:230:4: ( (lv_duration_3_0= RULE_INT ) )
                    // InternalGpx.g:231:5: (lv_duration_3_0= RULE_INT )
                    {
                    // InternalGpx.g:231:5: (lv_duration_3_0= RULE_INT )
                    // InternalGpx.g:232:6: lv_duration_3_0= RULE_INT
                    {
                    lv_duration_3_0=(Token)match(input,RULE_INT,FOLLOW_9); 

                    						newLeafNode(lv_duration_3_0, grammarAccess.getTaskAccess().getDurationINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"duration",
                    							lv_duration_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalGpx.g:248:4: ( (lv_durationUnit_4_0= ruleDURATION_UNIT ) )
                    // InternalGpx.g:249:5: (lv_durationUnit_4_0= ruleDURATION_UNIT )
                    {
                    // InternalGpx.g:249:5: (lv_durationUnit_4_0= ruleDURATION_UNIT )
                    // InternalGpx.g:250:6: lv_durationUnit_4_0= ruleDURATION_UNIT
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getDurationUnitDURATION_UNITEnumRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_durationUnit_4_0=ruleDURATION_UNIT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    						}
                    						set(
                    							current,
                    							"durationUnit",
                    							lv_durationUnit_4_0,
                    							"tdt4250.ganttproject.Gpx.DURATION_UNIT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGpx.g:268:3: (otherlv_5= 'from' ( (lv_startDate_6_0= ruleDate ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGpx.g:269:4: otherlv_5= 'from' ( (lv_startDate_6_0= ruleDate ) )
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getTaskAccess().getFromKeyword_3_0());
                    			
                    // InternalGpx.g:273:4: ( (lv_startDate_6_0= ruleDate ) )
                    // InternalGpx.g:274:5: (lv_startDate_6_0= ruleDate )
                    {
                    // InternalGpx.g:274:5: (lv_startDate_6_0= ruleDate )
                    // InternalGpx.g:275:6: lv_startDate_6_0= ruleDate
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getStartDateDateParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_startDate_6_0=ruleDate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    						}
                    						set(
                    							current,
                    							"startDate",
                    							lv_startDate_6_0,
                    							"tdt4250.ganttproject.Gpx.Date");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGpx.g:293:3: (otherlv_7= 'due' ( (lv_endDate_8_0= ruleDate ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGpx.g:294:4: otherlv_7= 'due' ( (lv_endDate_8_0= ruleDate ) )
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getTaskAccess().getDueKeyword_4_0());
                    			
                    // InternalGpx.g:298:4: ( (lv_endDate_8_0= ruleDate ) )
                    // InternalGpx.g:299:5: (lv_endDate_8_0= ruleDate )
                    {
                    // InternalGpx.g:299:5: (lv_endDate_8_0= ruleDate )
                    // InternalGpx.g:300:6: lv_endDate_8_0= ruleDate
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getEndDateDateParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_endDate_8_0=ruleDate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    						}
                    						set(
                    							current,
                    							"endDate",
                    							lv_endDate_8_0,
                    							"tdt4250.ganttproject.Gpx.Date");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGpx.g:318:3: ( (otherlv_9= ',' )? otherlv_10= 'depends' otherlv_11= 'on' ( (lv_dependency_12_0= ruleDependency ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=17 && LA8_0<=18)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGpx.g:319:4: (otherlv_9= ',' )? otherlv_10= 'depends' otherlv_11= 'on' ( (lv_dependency_12_0= ruleDependency ) )
                    {
                    // InternalGpx.g:319:4: (otherlv_9= ',' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==17) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalGpx.g:320:5: otherlv_9= ','
                            {
                            otherlv_9=(Token)match(input,17,FOLLOW_13); 

                            					newLeafNode(otherlv_9, grammarAccess.getTaskAccess().getCommaKeyword_5_0());
                            				

                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_10, grammarAccess.getTaskAccess().getDependsKeyword_5_1());
                    			
                    otherlv_11=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getTaskAccess().getOnKeyword_5_2());
                    			
                    // InternalGpx.g:333:4: ( (lv_dependency_12_0= ruleDependency ) )
                    // InternalGpx.g:334:5: (lv_dependency_12_0= ruleDependency )
                    {
                    // InternalGpx.g:334:5: (lv_dependency_12_0= ruleDependency )
                    // InternalGpx.g:335:6: lv_dependency_12_0= ruleDependency
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getDependencyDependencyParserRuleCall_5_3_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_dependency_12_0=ruleDependency();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    						}
                    						set(
                    							current,
                    							"dependency",
                    							lv_dependency_12_0,
                    							"tdt4250.ganttproject.Gpx.Dependency");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGpx.g:353:3: (otherlv_13= '{' ( (lv_subtasks_14_0= ruleAbstractTask ) ) (otherlv_15= ';' ( (lv_subtasks_16_0= ruleAbstractTask ) ) )* otherlv_17= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGpx.g:354:4: otherlv_13= '{' ( (lv_subtasks_14_0= ruleAbstractTask ) ) (otherlv_15= ';' ( (lv_subtasks_16_0= ruleAbstractTask ) ) )* otherlv_17= '}'
                    {
                    otherlv_13=(Token)match(input,20,FOLLOW_6); 

                    				newLeafNode(otherlv_13, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_6_0());
                    			
                    // InternalGpx.g:358:4: ( (lv_subtasks_14_0= ruleAbstractTask ) )
                    // InternalGpx.g:359:5: (lv_subtasks_14_0= ruleAbstractTask )
                    {
                    // InternalGpx.g:359:5: (lv_subtasks_14_0= ruleAbstractTask )
                    // InternalGpx.g:360:6: lv_subtasks_14_0= ruleAbstractTask
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getSubtasksAbstractTaskParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_subtasks_14_0=ruleAbstractTask();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    						}
                    						add(
                    							current,
                    							"subtasks",
                    							lv_subtasks_14_0,
                    							"tdt4250.ganttproject.Gpx.AbstractTask");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGpx.g:377:4: (otherlv_15= ';' ( (lv_subtasks_16_0= ruleAbstractTask ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==12) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalGpx.g:378:5: otherlv_15= ';' ( (lv_subtasks_16_0= ruleAbstractTask ) )
                    	    {
                    	    otherlv_15=(Token)match(input,12,FOLLOW_6); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getTaskAccess().getSemicolonKeyword_6_2_0());
                    	    				
                    	    // InternalGpx.g:382:5: ( (lv_subtasks_16_0= ruleAbstractTask ) )
                    	    // InternalGpx.g:383:6: (lv_subtasks_16_0= ruleAbstractTask )
                    	    {
                    	    // InternalGpx.g:383:6: (lv_subtasks_16_0= ruleAbstractTask )
                    	    // InternalGpx.g:384:7: lv_subtasks_16_0= ruleAbstractTask
                    	    {

                    	    							newCompositeNode(grammarAccess.getTaskAccess().getSubtasksAbstractTaskParserRuleCall_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_subtasks_16_0=ruleAbstractTask();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTaskRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"subtasks",
                    	    								lv_subtasks_16_0,
                    	    								"tdt4250.ganttproject.Gpx.AbstractTask");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_17, grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_6_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleMilestone"
    // InternalGpx.g:411:1: entryRuleMilestone returns [EObject current=null] : iv_ruleMilestone= ruleMilestone EOF ;
    public final EObject entryRuleMilestone() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMilestone = null;


        try {
            // InternalGpx.g:411:50: (iv_ruleMilestone= ruleMilestone EOF )
            // InternalGpx.g:412:2: iv_ruleMilestone= ruleMilestone EOF
            {
             newCompositeNode(grammarAccess.getMilestoneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMilestone=ruleMilestone();

            state._fsp--;

             current =iv_ruleMilestone; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMilestone"


    // $ANTLR start "ruleMilestone"
    // InternalGpx.g:418:1: ruleMilestone returns [EObject current=null] : (otherlv_0= 'Milestone' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'planned' ( (lv_endDate_3_0= ruleDate ) ) ( (otherlv_4= ',' )? otherlv_5= 'depends' otherlv_6= 'on' ( (lv_dependency_7_0= ruleDependency ) ) )? ) ;
    public final EObject ruleMilestone() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_endDate_3_0 = null;

        EObject lv_dependency_7_0 = null;



        	enterRule();

        try {
            // InternalGpx.g:424:2: ( (otherlv_0= 'Milestone' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'planned' ( (lv_endDate_3_0= ruleDate ) ) ( (otherlv_4= ',' )? otherlv_5= 'depends' otherlv_6= 'on' ( (lv_dependency_7_0= ruleDependency ) ) )? ) )
            // InternalGpx.g:425:2: (otherlv_0= 'Milestone' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'planned' ( (lv_endDate_3_0= ruleDate ) ) ( (otherlv_4= ',' )? otherlv_5= 'depends' otherlv_6= 'on' ( (lv_dependency_7_0= ruleDependency ) ) )? )
            {
            // InternalGpx.g:425:2: (otherlv_0= 'Milestone' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'planned' ( (lv_endDate_3_0= ruleDate ) ) ( (otherlv_4= ',' )? otherlv_5= 'depends' otherlv_6= 'on' ( (lv_dependency_7_0= ruleDependency ) ) )? )
            // InternalGpx.g:426:3: otherlv_0= 'Milestone' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'planned' ( (lv_endDate_3_0= ruleDate ) ) ( (otherlv_4= ',' )? otherlv_5= 'depends' otherlv_6= 'on' ( (lv_dependency_7_0= ruleDependency ) ) )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMilestoneAccess().getMilestoneKeyword_0());
            		
            // InternalGpx.g:430:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalGpx.g:431:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalGpx.g:431:4: (lv_name_1_0= RULE_STRING )
            // InternalGpx.g:432:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMilestoneAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMilestoneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getMilestoneAccess().getPlannedKeyword_2());
            		
            // InternalGpx.g:452:3: ( (lv_endDate_3_0= ruleDate ) )
            // InternalGpx.g:453:4: (lv_endDate_3_0= ruleDate )
            {
            // InternalGpx.g:453:4: (lv_endDate_3_0= ruleDate )
            // InternalGpx.g:454:5: lv_endDate_3_0= ruleDate
            {

            					newCompositeNode(grammarAccess.getMilestoneAccess().getEndDateDateParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
            lv_endDate_3_0=ruleDate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMilestoneRule());
            					}
            					set(
            						current,
            						"endDate",
            						lv_endDate_3_0,
            						"tdt4250.ganttproject.Gpx.Date");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGpx.g:471:3: ( (otherlv_4= ',' )? otherlv_5= 'depends' otherlv_6= 'on' ( (lv_dependency_7_0= ruleDependency ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=17 && LA12_0<=18)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGpx.g:472:4: (otherlv_4= ',' )? otherlv_5= 'depends' otherlv_6= 'on' ( (lv_dependency_7_0= ruleDependency ) )
                    {
                    // InternalGpx.g:472:4: (otherlv_4= ',' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==17) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalGpx.g:473:5: otherlv_4= ','
                            {
                            otherlv_4=(Token)match(input,17,FOLLOW_13); 

                            					newLeafNode(otherlv_4, grammarAccess.getMilestoneAccess().getCommaKeyword_4_0());
                            				

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getMilestoneAccess().getDependsKeyword_4_1());
                    			
                    otherlv_6=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getMilestoneAccess().getOnKeyword_4_2());
                    			
                    // InternalGpx.g:486:4: ( (lv_dependency_7_0= ruleDependency ) )
                    // InternalGpx.g:487:5: (lv_dependency_7_0= ruleDependency )
                    {
                    // InternalGpx.g:487:5: (lv_dependency_7_0= ruleDependency )
                    // InternalGpx.g:488:6: lv_dependency_7_0= ruleDependency
                    {

                    						newCompositeNode(grammarAccess.getMilestoneAccess().getDependencyDependencyParserRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_dependency_7_0=ruleDependency();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMilestoneRule());
                    						}
                    						set(
                    							current,
                    							"dependency",
                    							lv_dependency_7_0,
                    							"tdt4250.ganttproject.Gpx.Dependency");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMilestone"


    // $ANTLR start "entryRuleDependency"
    // InternalGpx.g:510:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // InternalGpx.g:510:51: (iv_ruleDependency= ruleDependency EOF )
            // InternalGpx.g:511:2: iv_ruleDependency= ruleDependency EOF
            {
             newCompositeNode(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependency=ruleDependency();

            state._fsp--;

             current =iv_ruleDependency; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // InternalGpx.g:517:1: ruleDependency returns [EObject current=null] : ( ( (otherlv_0= RULE_STRING ) ) (otherlv_1= ',' ( (otherlv_2= RULE_STRING ) ) )* ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalGpx.g:523:2: ( ( ( (otherlv_0= RULE_STRING ) ) (otherlv_1= ',' ( (otherlv_2= RULE_STRING ) ) )* ) )
            // InternalGpx.g:524:2: ( ( (otherlv_0= RULE_STRING ) ) (otherlv_1= ',' ( (otherlv_2= RULE_STRING ) ) )* )
            {
            // InternalGpx.g:524:2: ( ( (otherlv_0= RULE_STRING ) ) (otherlv_1= ',' ( (otherlv_2= RULE_STRING ) ) )* )
            // InternalGpx.g:525:3: ( (otherlv_0= RULE_STRING ) ) (otherlv_1= ',' ( (otherlv_2= RULE_STRING ) ) )*
            {
            // InternalGpx.g:525:3: ( (otherlv_0= RULE_STRING ) )
            // InternalGpx.g:526:4: (otherlv_0= RULE_STRING )
            {
            // InternalGpx.g:526:4: (otherlv_0= RULE_STRING )
            // InternalGpx.g:527:5: otherlv_0= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependencyRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(otherlv_0, grammarAccess.getDependencyAccess().getMasterAbstractTaskCrossReference_0_0());
            				

            }


            }

            // InternalGpx.g:538:3: (otherlv_1= ',' ( (otherlv_2= RULE_STRING ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==17) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGpx.g:539:4: otherlv_1= ',' ( (otherlv_2= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getDependencyAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalGpx.g:543:4: ( (otherlv_2= RULE_STRING ) )
            	    // InternalGpx.g:544:5: (otherlv_2= RULE_STRING )
            	    {
            	    // InternalGpx.g:544:5: (otherlv_2= RULE_STRING )
            	    // InternalGpx.g:545:6: otherlv_2= RULE_STRING
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDependencyRule());
            	    						}
            	    					
            	    otherlv_2=(Token)match(input,RULE_STRING,FOLLOW_19); 

            	    						newLeafNode(otherlv_2, grammarAccess.getDependencyAccess().getMasterAbstractTaskCrossReference_1_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRuleDate"
    // InternalGpx.g:561:1: entryRuleDate returns [String current=null] : iv_ruleDate= ruleDate EOF ;
    public final String entryRuleDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDate = null;


        try {
            // InternalGpx.g:561:44: (iv_ruleDate= ruleDate EOF )
            // InternalGpx.g:562:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // InternalGpx.g:568:1: ruleDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )+ kw= '.' (this_INT_2= RULE_INT )+ kw= '.' (this_INT_4= RULE_INT )+ ) ;
    public final AntlrDatatypeRuleToken ruleDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;


        	enterRule();

        try {
            // InternalGpx.g:574:2: ( ( (this_INT_0= RULE_INT )+ kw= '.' (this_INT_2= RULE_INT )+ kw= '.' (this_INT_4= RULE_INT )+ ) )
            // InternalGpx.g:575:2: ( (this_INT_0= RULE_INT )+ kw= '.' (this_INT_2= RULE_INT )+ kw= '.' (this_INT_4= RULE_INT )+ )
            {
            // InternalGpx.g:575:2: ( (this_INT_0= RULE_INT )+ kw= '.' (this_INT_2= RULE_INT )+ kw= '.' (this_INT_4= RULE_INT )+ )
            // InternalGpx.g:576:3: (this_INT_0= RULE_INT )+ kw= '.' (this_INT_2= RULE_INT )+ kw= '.' (this_INT_4= RULE_INT )+
            {
            // InternalGpx.g:576:3: (this_INT_0= RULE_INT )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_INT) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGpx.g:577:4: this_INT_0= RULE_INT
            	    {
            	    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            	    				current.merge(this_INT_0);
            	    			

            	    				newLeafNode(this_INT_0, grammarAccess.getDateAccess().getINTTerminalRuleCall_0());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            kw=(Token)match(input,24,FOLLOW_8); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDateAccess().getFullStopKeyword_1());
            		
            // InternalGpx.g:590:3: (this_INT_2= RULE_INT )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_INT) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGpx.g:591:4: this_INT_2= RULE_INT
            	    {
            	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_20); 

            	    				current.merge(this_INT_2);
            	    			

            	    				newLeafNode(this_INT_2, grammarAccess.getDateAccess().getINTTerminalRuleCall_2());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            kw=(Token)match(input,24,FOLLOW_8); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDateAccess().getFullStopKeyword_3());
            		
            // InternalGpx.g:604:3: (this_INT_4= RULE_INT )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_INT) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGpx.g:605:4: this_INT_4= RULE_INT
            	    {
            	    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_21); 

            	    				current.merge(this_INT_4);
            	    			

            	    				newLeafNode(this_INT_4, grammarAccess.getDateAccess().getINTTerminalRuleCall_4());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDate"


    // $ANTLR start "ruleDURATION_UNIT"
    // InternalGpx.g:617:1: ruleDURATION_UNIT returns [Enumerator current=null] : ( (enumLiteral_0= 'day' ) | (enumLiteral_1= 'days' ) | (enumLiteral_2= 'week' ) | (enumLiteral_3= 'weeks' ) ) ;
    public final Enumerator ruleDURATION_UNIT() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalGpx.g:623:2: ( ( (enumLiteral_0= 'day' ) | (enumLiteral_1= 'days' ) | (enumLiteral_2= 'week' ) | (enumLiteral_3= 'weeks' ) ) )
            // InternalGpx.g:624:2: ( (enumLiteral_0= 'day' ) | (enumLiteral_1= 'days' ) | (enumLiteral_2= 'week' ) | (enumLiteral_3= 'weeks' ) )
            {
            // InternalGpx.g:624:2: ( (enumLiteral_0= 'day' ) | (enumLiteral_1= 'days' ) | (enumLiteral_2= 'week' ) | (enumLiteral_3= 'weeks' ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt17=1;
                }
                break;
            case 26:
                {
                alt17=2;
                }
                break;
            case 27:
                {
                alt17=3;
                }
                break;
            case 28:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalGpx.g:625:3: (enumLiteral_0= 'day' )
                    {
                    // InternalGpx.g:625:3: (enumLiteral_0= 'day' )
                    // InternalGpx.g:626:4: enumLiteral_0= 'day'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getDURATION_UNITAccess().getDAYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDURATION_UNITAccess().getDAYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGpx.g:633:3: (enumLiteral_1= 'days' )
                    {
                    // InternalGpx.g:633:3: (enumLiteral_1= 'days' )
                    // InternalGpx.g:634:4: enumLiteral_1= 'days'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getDURATION_UNITAccess().getDAYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDURATION_UNITAccess().getDAYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGpx.g:641:3: (enumLiteral_2= 'week' )
                    {
                    // InternalGpx.g:641:3: (enumLiteral_2= 'week' )
                    // InternalGpx.g:642:4: enumLiteral_2= 'week'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getDURATION_UNITAccess().getWEEKEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDURATION_UNITAccess().getWEEKEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGpx.g:649:3: (enumLiteral_3= 'weeks' )
                    {
                    // InternalGpx.g:649:3: (enumLiteral_3= 'weeks' )
                    // InternalGpx.g:650:4: enumLiteral_3= 'weeks'
                    {
                    enumLiteral_3=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getDURATION_UNITAccess().getWEEKEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDURATION_UNITAccess().getWEEKEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDURATION_UNIT"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000402002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000017C002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000178002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000170002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000160002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000022L});

}