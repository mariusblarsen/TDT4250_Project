package tdt4250.ganttproject.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import tdt4250.ganttproject.services.GpxGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGpxParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'day'", "'days'", "'week'", "'weeks'", "'Project'", "';'", "'Task'", "'lasts'", "'from'", "'due'", "','", "'depends'", "'on'", "'{'", "'}'", "'Milestone'", "'planned'", "'.'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_INT=4;
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

    	public void setGrammarAccess(GpxGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleProject"
    // InternalGpx.g:53:1: entryRuleProject : ruleProject EOF ;
    public final void entryRuleProject() throws RecognitionException {
        try {
            // InternalGpx.g:54:1: ( ruleProject EOF )
            // InternalGpx.g:55:1: ruleProject EOF
            {
             before(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getProjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalGpx.g:62:1: ruleProject : ( ( rule__Project__Group__0 ) ) ;
    public final void ruleProject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:66:2: ( ( ( rule__Project__Group__0 ) ) )
            // InternalGpx.g:67:2: ( ( rule__Project__Group__0 ) )
            {
            // InternalGpx.g:67:2: ( ( rule__Project__Group__0 ) )
            // InternalGpx.g:68:3: ( rule__Project__Group__0 )
            {
             before(grammarAccess.getProjectAccess().getGroup()); 
            // InternalGpx.g:69:3: ( rule__Project__Group__0 )
            // InternalGpx.g:69:4: rule__Project__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleAbstractTask"
    // InternalGpx.g:78:1: entryRuleAbstractTask : ruleAbstractTask EOF ;
    public final void entryRuleAbstractTask() throws RecognitionException {
        try {
            // InternalGpx.g:79:1: ( ruleAbstractTask EOF )
            // InternalGpx.g:80:1: ruleAbstractTask EOF
            {
             before(grammarAccess.getAbstractTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractTask();

            state._fsp--;

             after(grammarAccess.getAbstractTaskRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractTask"


    // $ANTLR start "ruleAbstractTask"
    // InternalGpx.g:87:1: ruleAbstractTask : ( ( rule__AbstractTask__Alternatives ) ) ;
    public final void ruleAbstractTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:91:2: ( ( ( rule__AbstractTask__Alternatives ) ) )
            // InternalGpx.g:92:2: ( ( rule__AbstractTask__Alternatives ) )
            {
            // InternalGpx.g:92:2: ( ( rule__AbstractTask__Alternatives ) )
            // InternalGpx.g:93:3: ( rule__AbstractTask__Alternatives )
            {
             before(grammarAccess.getAbstractTaskAccess().getAlternatives()); 
            // InternalGpx.g:94:3: ( rule__AbstractTask__Alternatives )
            // InternalGpx.g:94:4: rule__AbstractTask__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractTask__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractTaskAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractTask"


    // $ANTLR start "entryRuleTask"
    // InternalGpx.g:103:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // InternalGpx.g:104:1: ( ruleTask EOF )
            // InternalGpx.g:105:1: ruleTask EOF
            {
             before(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getTaskRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalGpx.g:112:1: ruleTask : ( ( rule__Task__Group__0 ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:116:2: ( ( ( rule__Task__Group__0 ) ) )
            // InternalGpx.g:117:2: ( ( rule__Task__Group__0 ) )
            {
            // InternalGpx.g:117:2: ( ( rule__Task__Group__0 ) )
            // InternalGpx.g:118:3: ( rule__Task__Group__0 )
            {
             before(grammarAccess.getTaskAccess().getGroup()); 
            // InternalGpx.g:119:3: ( rule__Task__Group__0 )
            // InternalGpx.g:119:4: rule__Task__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleMilestone"
    // InternalGpx.g:128:1: entryRuleMilestone : ruleMilestone EOF ;
    public final void entryRuleMilestone() throws RecognitionException {
        try {
            // InternalGpx.g:129:1: ( ruleMilestone EOF )
            // InternalGpx.g:130:1: ruleMilestone EOF
            {
             before(grammarAccess.getMilestoneRule()); 
            pushFollow(FOLLOW_1);
            ruleMilestone();

            state._fsp--;

             after(grammarAccess.getMilestoneRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMilestone"


    // $ANTLR start "ruleMilestone"
    // InternalGpx.g:137:1: ruleMilestone : ( ( rule__Milestone__Group__0 ) ) ;
    public final void ruleMilestone() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:141:2: ( ( ( rule__Milestone__Group__0 ) ) )
            // InternalGpx.g:142:2: ( ( rule__Milestone__Group__0 ) )
            {
            // InternalGpx.g:142:2: ( ( rule__Milestone__Group__0 ) )
            // InternalGpx.g:143:3: ( rule__Milestone__Group__0 )
            {
             before(grammarAccess.getMilestoneAccess().getGroup()); 
            // InternalGpx.g:144:3: ( rule__Milestone__Group__0 )
            // InternalGpx.g:144:4: rule__Milestone__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Milestone__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMilestoneAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMilestone"


    // $ANTLR start "entryRuleDependency"
    // InternalGpx.g:153:1: entryRuleDependency : ruleDependency EOF ;
    public final void entryRuleDependency() throws RecognitionException {
        try {
            // InternalGpx.g:154:1: ( ruleDependency EOF )
            // InternalGpx.g:155:1: ruleDependency EOF
            {
             before(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_1);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getDependencyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // InternalGpx.g:162:1: ruleDependency : ( ( rule__Dependency__Group__0 ) ) ;
    public final void ruleDependency() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:166:2: ( ( ( rule__Dependency__Group__0 ) ) )
            // InternalGpx.g:167:2: ( ( rule__Dependency__Group__0 ) )
            {
            // InternalGpx.g:167:2: ( ( rule__Dependency__Group__0 ) )
            // InternalGpx.g:168:3: ( rule__Dependency__Group__0 )
            {
             before(grammarAccess.getDependencyAccess().getGroup()); 
            // InternalGpx.g:169:3: ( rule__Dependency__Group__0 )
            // InternalGpx.g:169:4: rule__Dependency__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Dependency__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDependencyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRuleDate"
    // InternalGpx.g:178:1: entryRuleDate : ruleDate EOF ;
    public final void entryRuleDate() throws RecognitionException {
        try {
            // InternalGpx.g:179:1: ( ruleDate EOF )
            // InternalGpx.g:180:1: ruleDate EOF
            {
             before(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_1);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getDateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // InternalGpx.g:187:1: ruleDate : ( ( rule__Date__Group__0 ) ) ;
    public final void ruleDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:191:2: ( ( ( rule__Date__Group__0 ) ) )
            // InternalGpx.g:192:2: ( ( rule__Date__Group__0 ) )
            {
            // InternalGpx.g:192:2: ( ( rule__Date__Group__0 ) )
            // InternalGpx.g:193:3: ( rule__Date__Group__0 )
            {
             before(grammarAccess.getDateAccess().getGroup()); 
            // InternalGpx.g:194:3: ( rule__Date__Group__0 )
            // InternalGpx.g:194:4: rule__Date__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Date__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDate"


    // $ANTLR start "ruleDURATION_UNIT"
    // InternalGpx.g:203:1: ruleDURATION_UNIT : ( ( rule__DURATION_UNIT__Alternatives ) ) ;
    public final void ruleDURATION_UNIT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:207:1: ( ( ( rule__DURATION_UNIT__Alternatives ) ) )
            // InternalGpx.g:208:2: ( ( rule__DURATION_UNIT__Alternatives ) )
            {
            // InternalGpx.g:208:2: ( ( rule__DURATION_UNIT__Alternatives ) )
            // InternalGpx.g:209:3: ( rule__DURATION_UNIT__Alternatives )
            {
             before(grammarAccess.getDURATION_UNITAccess().getAlternatives()); 
            // InternalGpx.g:210:3: ( rule__DURATION_UNIT__Alternatives )
            // InternalGpx.g:210:4: rule__DURATION_UNIT__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DURATION_UNIT__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDURATION_UNITAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDURATION_UNIT"


    // $ANTLR start "rule__AbstractTask__Alternatives"
    // InternalGpx.g:218:1: rule__AbstractTask__Alternatives : ( ( ruleTask ) | ( ruleMilestone ) );
    public final void rule__AbstractTask__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:222:1: ( ( ruleTask ) | ( ruleMilestone ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            else if ( (LA1_0==26) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalGpx.g:223:2: ( ruleTask )
                    {
                    // InternalGpx.g:223:2: ( ruleTask )
                    // InternalGpx.g:224:3: ruleTask
                    {
                     before(grammarAccess.getAbstractTaskAccess().getTaskParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTask();

                    state._fsp--;

                     after(grammarAccess.getAbstractTaskAccess().getTaskParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGpx.g:229:2: ( ruleMilestone )
                    {
                    // InternalGpx.g:229:2: ( ruleMilestone )
                    // InternalGpx.g:230:3: ruleMilestone
                    {
                     before(grammarAccess.getAbstractTaskAccess().getMilestoneParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMilestone();

                    state._fsp--;

                     after(grammarAccess.getAbstractTaskAccess().getMilestoneParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractTask__Alternatives"


    // $ANTLR start "rule__DURATION_UNIT__Alternatives"
    // InternalGpx.g:239:1: rule__DURATION_UNIT__Alternatives : ( ( ( 'day' ) ) | ( ( 'days' ) ) | ( ( 'week' ) ) | ( ( 'weeks' ) ) );
    public final void rule__DURATION_UNIT__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:243:1: ( ( ( 'day' ) ) | ( ( 'days' ) ) | ( ( 'week' ) ) | ( ( 'weeks' ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGpx.g:244:2: ( ( 'day' ) )
                    {
                    // InternalGpx.g:244:2: ( ( 'day' ) )
                    // InternalGpx.g:245:3: ( 'day' )
                    {
                     before(grammarAccess.getDURATION_UNITAccess().getDAYEnumLiteralDeclaration_0()); 
                    // InternalGpx.g:246:3: ( 'day' )
                    // InternalGpx.g:246:4: 'day'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getDURATION_UNITAccess().getDAYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGpx.g:250:2: ( ( 'days' ) )
                    {
                    // InternalGpx.g:250:2: ( ( 'days' ) )
                    // InternalGpx.g:251:3: ( 'days' )
                    {
                     before(grammarAccess.getDURATION_UNITAccess().getDAYEnumLiteralDeclaration_1()); 
                    // InternalGpx.g:252:3: ( 'days' )
                    // InternalGpx.g:252:4: 'days'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getDURATION_UNITAccess().getDAYEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGpx.g:256:2: ( ( 'week' ) )
                    {
                    // InternalGpx.g:256:2: ( ( 'week' ) )
                    // InternalGpx.g:257:3: ( 'week' )
                    {
                     before(grammarAccess.getDURATION_UNITAccess().getWEEKEnumLiteralDeclaration_2()); 
                    // InternalGpx.g:258:3: ( 'week' )
                    // InternalGpx.g:258:4: 'week'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getDURATION_UNITAccess().getWEEKEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGpx.g:262:2: ( ( 'weeks' ) )
                    {
                    // InternalGpx.g:262:2: ( ( 'weeks' ) )
                    // InternalGpx.g:263:3: ( 'weeks' )
                    {
                     before(grammarAccess.getDURATION_UNITAccess().getWEEKEnumLiteralDeclaration_3()); 
                    // InternalGpx.g:264:3: ( 'weeks' )
                    // InternalGpx.g:264:4: 'weeks'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDURATION_UNITAccess().getWEEKEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DURATION_UNIT__Alternatives"


    // $ANTLR start "rule__Project__Group__0"
    // InternalGpx.g:272:1: rule__Project__Group__0 : rule__Project__Group__0__Impl rule__Project__Group__1 ;
    public final void rule__Project__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:276:1: ( rule__Project__Group__0__Impl rule__Project__Group__1 )
            // InternalGpx.g:277:2: rule__Project__Group__0__Impl rule__Project__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Project__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__0"


    // $ANTLR start "rule__Project__Group__0__Impl"
    // InternalGpx.g:284:1: rule__Project__Group__0__Impl : ( 'Project' ) ;
    public final void rule__Project__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:288:1: ( ( 'Project' ) )
            // InternalGpx.g:289:1: ( 'Project' )
            {
            // InternalGpx.g:289:1: ( 'Project' )
            // InternalGpx.g:290:2: 'Project'
            {
             before(grammarAccess.getProjectAccess().getProjectKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getProjectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__0__Impl"


    // $ANTLR start "rule__Project__Group__1"
    // InternalGpx.g:299:1: rule__Project__Group__1 : rule__Project__Group__1__Impl rule__Project__Group__2 ;
    public final void rule__Project__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:303:1: ( rule__Project__Group__1__Impl rule__Project__Group__2 )
            // InternalGpx.g:304:2: rule__Project__Group__1__Impl rule__Project__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Project__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__1"


    // $ANTLR start "rule__Project__Group__1__Impl"
    // InternalGpx.g:311:1: rule__Project__Group__1__Impl : ( ( rule__Project__NameAssignment_1 ) ) ;
    public final void rule__Project__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:315:1: ( ( ( rule__Project__NameAssignment_1 ) ) )
            // InternalGpx.g:316:1: ( ( rule__Project__NameAssignment_1 ) )
            {
            // InternalGpx.g:316:1: ( ( rule__Project__NameAssignment_1 ) )
            // InternalGpx.g:317:2: ( rule__Project__NameAssignment_1 )
            {
             before(grammarAccess.getProjectAccess().getNameAssignment_1()); 
            // InternalGpx.g:318:2: ( rule__Project__NameAssignment_1 )
            // InternalGpx.g:318:3: rule__Project__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Project__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__1__Impl"


    // $ANTLR start "rule__Project__Group__2"
    // InternalGpx.g:326:1: rule__Project__Group__2 : rule__Project__Group__2__Impl ;
    public final void rule__Project__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:330:1: ( rule__Project__Group__2__Impl )
            // InternalGpx.g:331:2: rule__Project__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__2"


    // $ANTLR start "rule__Project__Group__2__Impl"
    // InternalGpx.g:337:1: rule__Project__Group__2__Impl : ( ( rule__Project__Group_2__0 )? ) ;
    public final void rule__Project__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:341:1: ( ( ( rule__Project__Group_2__0 )? ) )
            // InternalGpx.g:342:1: ( ( rule__Project__Group_2__0 )? )
            {
            // InternalGpx.g:342:1: ( ( rule__Project__Group_2__0 )? )
            // InternalGpx.g:343:2: ( rule__Project__Group_2__0 )?
            {
             before(grammarAccess.getProjectAccess().getGroup_2()); 
            // InternalGpx.g:344:2: ( rule__Project__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17||LA3_0==26) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGpx.g:344:3: rule__Project__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Project__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__2__Impl"


    // $ANTLR start "rule__Project__Group_2__0"
    // InternalGpx.g:353:1: rule__Project__Group_2__0 : rule__Project__Group_2__0__Impl rule__Project__Group_2__1 ;
    public final void rule__Project__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:357:1: ( rule__Project__Group_2__0__Impl rule__Project__Group_2__1 )
            // InternalGpx.g:358:2: rule__Project__Group_2__0__Impl rule__Project__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Project__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_2__0"


    // $ANTLR start "rule__Project__Group_2__0__Impl"
    // InternalGpx.g:365:1: rule__Project__Group_2__0__Impl : ( ( rule__Project__TasksAssignment_2_0 ) ) ;
    public final void rule__Project__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:369:1: ( ( ( rule__Project__TasksAssignment_2_0 ) ) )
            // InternalGpx.g:370:1: ( ( rule__Project__TasksAssignment_2_0 ) )
            {
            // InternalGpx.g:370:1: ( ( rule__Project__TasksAssignment_2_0 ) )
            // InternalGpx.g:371:2: ( rule__Project__TasksAssignment_2_0 )
            {
             before(grammarAccess.getProjectAccess().getTasksAssignment_2_0()); 
            // InternalGpx.g:372:2: ( rule__Project__TasksAssignment_2_0 )
            // InternalGpx.g:372:3: rule__Project__TasksAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Project__TasksAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getTasksAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_2__0__Impl"


    // $ANTLR start "rule__Project__Group_2__1"
    // InternalGpx.g:380:1: rule__Project__Group_2__1 : rule__Project__Group_2__1__Impl ;
    public final void rule__Project__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:384:1: ( rule__Project__Group_2__1__Impl )
            // InternalGpx.g:385:2: rule__Project__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_2__1"


    // $ANTLR start "rule__Project__Group_2__1__Impl"
    // InternalGpx.g:391:1: rule__Project__Group_2__1__Impl : ( ( rule__Project__Group_2_1__0 )* ) ;
    public final void rule__Project__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:395:1: ( ( ( rule__Project__Group_2_1__0 )* ) )
            // InternalGpx.g:396:1: ( ( rule__Project__Group_2_1__0 )* )
            {
            // InternalGpx.g:396:1: ( ( rule__Project__Group_2_1__0 )* )
            // InternalGpx.g:397:2: ( rule__Project__Group_2_1__0 )*
            {
             before(grammarAccess.getProjectAccess().getGroup_2_1()); 
            // InternalGpx.g:398:2: ( rule__Project__Group_2_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGpx.g:398:3: rule__Project__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Project__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_2__1__Impl"


    // $ANTLR start "rule__Project__Group_2_1__0"
    // InternalGpx.g:407:1: rule__Project__Group_2_1__0 : rule__Project__Group_2_1__0__Impl rule__Project__Group_2_1__1 ;
    public final void rule__Project__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:411:1: ( rule__Project__Group_2_1__0__Impl rule__Project__Group_2_1__1 )
            // InternalGpx.g:412:2: rule__Project__Group_2_1__0__Impl rule__Project__Group_2_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Project__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_2_1__0"


    // $ANTLR start "rule__Project__Group_2_1__0__Impl"
    // InternalGpx.g:419:1: rule__Project__Group_2_1__0__Impl : ( ';' ) ;
    public final void rule__Project__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:423:1: ( ( ';' ) )
            // InternalGpx.g:424:1: ( ';' )
            {
            // InternalGpx.g:424:1: ( ';' )
            // InternalGpx.g:425:2: ';'
            {
             before(grammarAccess.getProjectAccess().getSemicolonKeyword_2_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getSemicolonKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_2_1__0__Impl"


    // $ANTLR start "rule__Project__Group_2_1__1"
    // InternalGpx.g:434:1: rule__Project__Group_2_1__1 : rule__Project__Group_2_1__1__Impl ;
    public final void rule__Project__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:438:1: ( rule__Project__Group_2_1__1__Impl )
            // InternalGpx.g:439:2: rule__Project__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_2_1__1"


    // $ANTLR start "rule__Project__Group_2_1__1__Impl"
    // InternalGpx.g:445:1: rule__Project__Group_2_1__1__Impl : ( ( rule__Project__TasksAssignment_2_1_1 ) ) ;
    public final void rule__Project__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:449:1: ( ( ( rule__Project__TasksAssignment_2_1_1 ) ) )
            // InternalGpx.g:450:1: ( ( rule__Project__TasksAssignment_2_1_1 ) )
            {
            // InternalGpx.g:450:1: ( ( rule__Project__TasksAssignment_2_1_1 ) )
            // InternalGpx.g:451:2: ( rule__Project__TasksAssignment_2_1_1 )
            {
             before(grammarAccess.getProjectAccess().getTasksAssignment_2_1_1()); 
            // InternalGpx.g:452:2: ( rule__Project__TasksAssignment_2_1_1 )
            // InternalGpx.g:452:3: rule__Project__TasksAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Project__TasksAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getTasksAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_2_1__1__Impl"


    // $ANTLR start "rule__Task__Group__0"
    // InternalGpx.g:461:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:465:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // InternalGpx.g:466:2: rule__Task__Group__0__Impl rule__Task__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Task__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__0"


    // $ANTLR start "rule__Task__Group__0__Impl"
    // InternalGpx.g:473:1: rule__Task__Group__0__Impl : ( 'Task' ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:477:1: ( ( 'Task' ) )
            // InternalGpx.g:478:1: ( 'Task' )
            {
            // InternalGpx.g:478:1: ( 'Task' )
            // InternalGpx.g:479:2: 'Task'
            {
             before(grammarAccess.getTaskAccess().getTaskKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTaskKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__0__Impl"


    // $ANTLR start "rule__Task__Group__1"
    // InternalGpx.g:488:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:492:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // InternalGpx.g:493:2: rule__Task__Group__1__Impl rule__Task__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Task__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__1"


    // $ANTLR start "rule__Task__Group__1__Impl"
    // InternalGpx.g:500:1: rule__Task__Group__1__Impl : ( ( rule__Task__NameAssignment_1 ) ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:504:1: ( ( ( rule__Task__NameAssignment_1 ) ) )
            // InternalGpx.g:505:1: ( ( rule__Task__NameAssignment_1 ) )
            {
            // InternalGpx.g:505:1: ( ( rule__Task__NameAssignment_1 ) )
            // InternalGpx.g:506:2: ( rule__Task__NameAssignment_1 )
            {
             before(grammarAccess.getTaskAccess().getNameAssignment_1()); 
            // InternalGpx.g:507:2: ( rule__Task__NameAssignment_1 )
            // InternalGpx.g:507:3: rule__Task__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__1__Impl"


    // $ANTLR start "rule__Task__Group__2"
    // InternalGpx.g:515:1: rule__Task__Group__2 : rule__Task__Group__2__Impl rule__Task__Group__3 ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:519:1: ( rule__Task__Group__2__Impl rule__Task__Group__3 )
            // InternalGpx.g:520:2: rule__Task__Group__2__Impl rule__Task__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Task__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__2"


    // $ANTLR start "rule__Task__Group__2__Impl"
    // InternalGpx.g:527:1: rule__Task__Group__2__Impl : ( ( rule__Task__Group_2__0 )? ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:531:1: ( ( ( rule__Task__Group_2__0 )? ) )
            // InternalGpx.g:532:1: ( ( rule__Task__Group_2__0 )? )
            {
            // InternalGpx.g:532:1: ( ( rule__Task__Group_2__0 )? )
            // InternalGpx.g:533:2: ( rule__Task__Group_2__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_2()); 
            // InternalGpx.g:534:2: ( rule__Task__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGpx.g:534:3: rule__Task__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__2__Impl"


    // $ANTLR start "rule__Task__Group__3"
    // InternalGpx.g:542:1: rule__Task__Group__3 : rule__Task__Group__3__Impl rule__Task__Group__4 ;
    public final void rule__Task__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:546:1: ( rule__Task__Group__3__Impl rule__Task__Group__4 )
            // InternalGpx.g:547:2: rule__Task__Group__3__Impl rule__Task__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Task__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__3"


    // $ANTLR start "rule__Task__Group__3__Impl"
    // InternalGpx.g:554:1: rule__Task__Group__3__Impl : ( ( rule__Task__Group_3__0 )? ) ;
    public final void rule__Task__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:558:1: ( ( ( rule__Task__Group_3__0 )? ) )
            // InternalGpx.g:559:1: ( ( rule__Task__Group_3__0 )? )
            {
            // InternalGpx.g:559:1: ( ( rule__Task__Group_3__0 )? )
            // InternalGpx.g:560:2: ( rule__Task__Group_3__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_3()); 
            // InternalGpx.g:561:2: ( rule__Task__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGpx.g:561:3: rule__Task__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__3__Impl"


    // $ANTLR start "rule__Task__Group__4"
    // InternalGpx.g:569:1: rule__Task__Group__4 : rule__Task__Group__4__Impl rule__Task__Group__5 ;
    public final void rule__Task__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:573:1: ( rule__Task__Group__4__Impl rule__Task__Group__5 )
            // InternalGpx.g:574:2: rule__Task__Group__4__Impl rule__Task__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Task__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__4"


    // $ANTLR start "rule__Task__Group__4__Impl"
    // InternalGpx.g:581:1: rule__Task__Group__4__Impl : ( ( rule__Task__Group_4__0 )? ) ;
    public final void rule__Task__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:585:1: ( ( ( rule__Task__Group_4__0 )? ) )
            // InternalGpx.g:586:1: ( ( rule__Task__Group_4__0 )? )
            {
            // InternalGpx.g:586:1: ( ( rule__Task__Group_4__0 )? )
            // InternalGpx.g:587:2: ( rule__Task__Group_4__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_4()); 
            // InternalGpx.g:588:2: ( rule__Task__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGpx.g:588:3: rule__Task__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__4__Impl"


    // $ANTLR start "rule__Task__Group__5"
    // InternalGpx.g:596:1: rule__Task__Group__5 : rule__Task__Group__5__Impl rule__Task__Group__6 ;
    public final void rule__Task__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:600:1: ( rule__Task__Group__5__Impl rule__Task__Group__6 )
            // InternalGpx.g:601:2: rule__Task__Group__5__Impl rule__Task__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Task__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__5"


    // $ANTLR start "rule__Task__Group__5__Impl"
    // InternalGpx.g:608:1: rule__Task__Group__5__Impl : ( ( rule__Task__Group_5__0 )? ) ;
    public final void rule__Task__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:612:1: ( ( ( rule__Task__Group_5__0 )? ) )
            // InternalGpx.g:613:1: ( ( rule__Task__Group_5__0 )? )
            {
            // InternalGpx.g:613:1: ( ( rule__Task__Group_5__0 )? )
            // InternalGpx.g:614:2: ( rule__Task__Group_5__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_5()); 
            // InternalGpx.g:615:2: ( rule__Task__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=21 && LA8_0<=22)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGpx.g:615:3: rule__Task__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__5__Impl"


    // $ANTLR start "rule__Task__Group__6"
    // InternalGpx.g:623:1: rule__Task__Group__6 : rule__Task__Group__6__Impl ;
    public final void rule__Task__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:627:1: ( rule__Task__Group__6__Impl )
            // InternalGpx.g:628:2: rule__Task__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__6"


    // $ANTLR start "rule__Task__Group__6__Impl"
    // InternalGpx.g:634:1: rule__Task__Group__6__Impl : ( ( rule__Task__Group_6__0 )? ) ;
    public final void rule__Task__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:638:1: ( ( ( rule__Task__Group_6__0 )? ) )
            // InternalGpx.g:639:1: ( ( rule__Task__Group_6__0 )? )
            {
            // InternalGpx.g:639:1: ( ( rule__Task__Group_6__0 )? )
            // InternalGpx.g:640:2: ( rule__Task__Group_6__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_6()); 
            // InternalGpx.g:641:2: ( rule__Task__Group_6__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGpx.g:641:3: rule__Task__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__6__Impl"


    // $ANTLR start "rule__Task__Group_2__0"
    // InternalGpx.g:650:1: rule__Task__Group_2__0 : rule__Task__Group_2__0__Impl rule__Task__Group_2__1 ;
    public final void rule__Task__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:654:1: ( rule__Task__Group_2__0__Impl rule__Task__Group_2__1 )
            // InternalGpx.g:655:2: rule__Task__Group_2__0__Impl rule__Task__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Task__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_2__0"


    // $ANTLR start "rule__Task__Group_2__0__Impl"
    // InternalGpx.g:662:1: rule__Task__Group_2__0__Impl : ( 'lasts' ) ;
    public final void rule__Task__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:666:1: ( ( 'lasts' ) )
            // InternalGpx.g:667:1: ( 'lasts' )
            {
            // InternalGpx.g:667:1: ( 'lasts' )
            // InternalGpx.g:668:2: 'lasts'
            {
             before(grammarAccess.getTaskAccess().getLastsKeyword_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getLastsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_2__0__Impl"


    // $ANTLR start "rule__Task__Group_2__1"
    // InternalGpx.g:677:1: rule__Task__Group_2__1 : rule__Task__Group_2__1__Impl rule__Task__Group_2__2 ;
    public final void rule__Task__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:681:1: ( rule__Task__Group_2__1__Impl rule__Task__Group_2__2 )
            // InternalGpx.g:682:2: rule__Task__Group_2__1__Impl rule__Task__Group_2__2
            {
            pushFollow(FOLLOW_9);
            rule__Task__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_2__1"


    // $ANTLR start "rule__Task__Group_2__1__Impl"
    // InternalGpx.g:689:1: rule__Task__Group_2__1__Impl : ( ( rule__Task__DurationAssignment_2_1 ) ) ;
    public final void rule__Task__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:693:1: ( ( ( rule__Task__DurationAssignment_2_1 ) ) )
            // InternalGpx.g:694:1: ( ( rule__Task__DurationAssignment_2_1 ) )
            {
            // InternalGpx.g:694:1: ( ( rule__Task__DurationAssignment_2_1 ) )
            // InternalGpx.g:695:2: ( rule__Task__DurationAssignment_2_1 )
            {
             before(grammarAccess.getTaskAccess().getDurationAssignment_2_1()); 
            // InternalGpx.g:696:2: ( rule__Task__DurationAssignment_2_1 )
            // InternalGpx.g:696:3: rule__Task__DurationAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__DurationAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getDurationAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_2__1__Impl"


    // $ANTLR start "rule__Task__Group_2__2"
    // InternalGpx.g:704:1: rule__Task__Group_2__2 : rule__Task__Group_2__2__Impl ;
    public final void rule__Task__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:708:1: ( rule__Task__Group_2__2__Impl )
            // InternalGpx.g:709:2: rule__Task__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_2__2"


    // $ANTLR start "rule__Task__Group_2__2__Impl"
    // InternalGpx.g:715:1: rule__Task__Group_2__2__Impl : ( ( rule__Task__DurationUnitAssignment_2_2 ) ) ;
    public final void rule__Task__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:719:1: ( ( ( rule__Task__DurationUnitAssignment_2_2 ) ) )
            // InternalGpx.g:720:1: ( ( rule__Task__DurationUnitAssignment_2_2 ) )
            {
            // InternalGpx.g:720:1: ( ( rule__Task__DurationUnitAssignment_2_2 ) )
            // InternalGpx.g:721:2: ( rule__Task__DurationUnitAssignment_2_2 )
            {
             before(grammarAccess.getTaskAccess().getDurationUnitAssignment_2_2()); 
            // InternalGpx.g:722:2: ( rule__Task__DurationUnitAssignment_2_2 )
            // InternalGpx.g:722:3: rule__Task__DurationUnitAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Task__DurationUnitAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getDurationUnitAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_2__2__Impl"


    // $ANTLR start "rule__Task__Group_3__0"
    // InternalGpx.g:731:1: rule__Task__Group_3__0 : rule__Task__Group_3__0__Impl rule__Task__Group_3__1 ;
    public final void rule__Task__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:735:1: ( rule__Task__Group_3__0__Impl rule__Task__Group_3__1 )
            // InternalGpx.g:736:2: rule__Task__Group_3__0__Impl rule__Task__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Task__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_3__0"


    // $ANTLR start "rule__Task__Group_3__0__Impl"
    // InternalGpx.g:743:1: rule__Task__Group_3__0__Impl : ( 'from' ) ;
    public final void rule__Task__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:747:1: ( ( 'from' ) )
            // InternalGpx.g:748:1: ( 'from' )
            {
            // InternalGpx.g:748:1: ( 'from' )
            // InternalGpx.g:749:2: 'from'
            {
             before(grammarAccess.getTaskAccess().getFromKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getFromKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_3__0__Impl"


    // $ANTLR start "rule__Task__Group_3__1"
    // InternalGpx.g:758:1: rule__Task__Group_3__1 : rule__Task__Group_3__1__Impl ;
    public final void rule__Task__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:762:1: ( rule__Task__Group_3__1__Impl )
            // InternalGpx.g:763:2: rule__Task__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_3__1"


    // $ANTLR start "rule__Task__Group_3__1__Impl"
    // InternalGpx.g:769:1: rule__Task__Group_3__1__Impl : ( ( rule__Task__StartDateAssignment_3_1 ) ) ;
    public final void rule__Task__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:773:1: ( ( ( rule__Task__StartDateAssignment_3_1 ) ) )
            // InternalGpx.g:774:1: ( ( rule__Task__StartDateAssignment_3_1 ) )
            {
            // InternalGpx.g:774:1: ( ( rule__Task__StartDateAssignment_3_1 ) )
            // InternalGpx.g:775:2: ( rule__Task__StartDateAssignment_3_1 )
            {
             before(grammarAccess.getTaskAccess().getStartDateAssignment_3_1()); 
            // InternalGpx.g:776:2: ( rule__Task__StartDateAssignment_3_1 )
            // InternalGpx.g:776:3: rule__Task__StartDateAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__StartDateAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getStartDateAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_3__1__Impl"


    // $ANTLR start "rule__Task__Group_4__0"
    // InternalGpx.g:785:1: rule__Task__Group_4__0 : rule__Task__Group_4__0__Impl rule__Task__Group_4__1 ;
    public final void rule__Task__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:789:1: ( rule__Task__Group_4__0__Impl rule__Task__Group_4__1 )
            // InternalGpx.g:790:2: rule__Task__Group_4__0__Impl rule__Task__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__Task__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_4__0"


    // $ANTLR start "rule__Task__Group_4__0__Impl"
    // InternalGpx.g:797:1: rule__Task__Group_4__0__Impl : ( 'due' ) ;
    public final void rule__Task__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:801:1: ( ( 'due' ) )
            // InternalGpx.g:802:1: ( 'due' )
            {
            // InternalGpx.g:802:1: ( 'due' )
            // InternalGpx.g:803:2: 'due'
            {
             before(grammarAccess.getTaskAccess().getDueKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getDueKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_4__0__Impl"


    // $ANTLR start "rule__Task__Group_4__1"
    // InternalGpx.g:812:1: rule__Task__Group_4__1 : rule__Task__Group_4__1__Impl ;
    public final void rule__Task__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:816:1: ( rule__Task__Group_4__1__Impl )
            // InternalGpx.g:817:2: rule__Task__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_4__1"


    // $ANTLR start "rule__Task__Group_4__1__Impl"
    // InternalGpx.g:823:1: rule__Task__Group_4__1__Impl : ( ( rule__Task__EndDateAssignment_4_1 ) ) ;
    public final void rule__Task__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:827:1: ( ( ( rule__Task__EndDateAssignment_4_1 ) ) )
            // InternalGpx.g:828:1: ( ( rule__Task__EndDateAssignment_4_1 ) )
            {
            // InternalGpx.g:828:1: ( ( rule__Task__EndDateAssignment_4_1 ) )
            // InternalGpx.g:829:2: ( rule__Task__EndDateAssignment_4_1 )
            {
             before(grammarAccess.getTaskAccess().getEndDateAssignment_4_1()); 
            // InternalGpx.g:830:2: ( rule__Task__EndDateAssignment_4_1 )
            // InternalGpx.g:830:3: rule__Task__EndDateAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__EndDateAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getEndDateAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_4__1__Impl"


    // $ANTLR start "rule__Task__Group_5__0"
    // InternalGpx.g:839:1: rule__Task__Group_5__0 : rule__Task__Group_5__0__Impl rule__Task__Group_5__1 ;
    public final void rule__Task__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:843:1: ( rule__Task__Group_5__0__Impl rule__Task__Group_5__1 )
            // InternalGpx.g:844:2: rule__Task__Group_5__0__Impl rule__Task__Group_5__1
            {
            pushFollow(FOLLOW_10);
            rule__Task__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_5__0"


    // $ANTLR start "rule__Task__Group_5__0__Impl"
    // InternalGpx.g:851:1: rule__Task__Group_5__0__Impl : ( ( ',' )? ) ;
    public final void rule__Task__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:855:1: ( ( ( ',' )? ) )
            // InternalGpx.g:856:1: ( ( ',' )? )
            {
            // InternalGpx.g:856:1: ( ( ',' )? )
            // InternalGpx.g:857:2: ( ',' )?
            {
             before(grammarAccess.getTaskAccess().getCommaKeyword_5_0()); 
            // InternalGpx.g:858:2: ( ',' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGpx.g:858:3: ','
                    {
                    match(input,21,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_5__0__Impl"


    // $ANTLR start "rule__Task__Group_5__1"
    // InternalGpx.g:866:1: rule__Task__Group_5__1 : rule__Task__Group_5__1__Impl rule__Task__Group_5__2 ;
    public final void rule__Task__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:870:1: ( rule__Task__Group_5__1__Impl rule__Task__Group_5__2 )
            // InternalGpx.g:871:2: rule__Task__Group_5__1__Impl rule__Task__Group_5__2
            {
            pushFollow(FOLLOW_11);
            rule__Task__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_5__1"


    // $ANTLR start "rule__Task__Group_5__1__Impl"
    // InternalGpx.g:878:1: rule__Task__Group_5__1__Impl : ( 'depends' ) ;
    public final void rule__Task__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:882:1: ( ( 'depends' ) )
            // InternalGpx.g:883:1: ( 'depends' )
            {
            // InternalGpx.g:883:1: ( 'depends' )
            // InternalGpx.g:884:2: 'depends'
            {
             before(grammarAccess.getTaskAccess().getDependsKeyword_5_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getDependsKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_5__1__Impl"


    // $ANTLR start "rule__Task__Group_5__2"
    // InternalGpx.g:893:1: rule__Task__Group_5__2 : rule__Task__Group_5__2__Impl rule__Task__Group_5__3 ;
    public final void rule__Task__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:897:1: ( rule__Task__Group_5__2__Impl rule__Task__Group_5__3 )
            // InternalGpx.g:898:2: rule__Task__Group_5__2__Impl rule__Task__Group_5__3
            {
            pushFollow(FOLLOW_3);
            rule__Task__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_5__2"


    // $ANTLR start "rule__Task__Group_5__2__Impl"
    // InternalGpx.g:905:1: rule__Task__Group_5__2__Impl : ( 'on' ) ;
    public final void rule__Task__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:909:1: ( ( 'on' ) )
            // InternalGpx.g:910:1: ( 'on' )
            {
            // InternalGpx.g:910:1: ( 'on' )
            // InternalGpx.g:911:2: 'on'
            {
             before(grammarAccess.getTaskAccess().getOnKeyword_5_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getOnKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_5__2__Impl"


    // $ANTLR start "rule__Task__Group_5__3"
    // InternalGpx.g:920:1: rule__Task__Group_5__3 : rule__Task__Group_5__3__Impl ;
    public final void rule__Task__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:924:1: ( rule__Task__Group_5__3__Impl )
            // InternalGpx.g:925:2: rule__Task__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_5__3"


    // $ANTLR start "rule__Task__Group_5__3__Impl"
    // InternalGpx.g:931:1: rule__Task__Group_5__3__Impl : ( ( rule__Task__DependencyAssignment_5_3 ) ) ;
    public final void rule__Task__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:935:1: ( ( ( rule__Task__DependencyAssignment_5_3 ) ) )
            // InternalGpx.g:936:1: ( ( rule__Task__DependencyAssignment_5_3 ) )
            {
            // InternalGpx.g:936:1: ( ( rule__Task__DependencyAssignment_5_3 ) )
            // InternalGpx.g:937:2: ( rule__Task__DependencyAssignment_5_3 )
            {
             before(grammarAccess.getTaskAccess().getDependencyAssignment_5_3()); 
            // InternalGpx.g:938:2: ( rule__Task__DependencyAssignment_5_3 )
            // InternalGpx.g:938:3: rule__Task__DependencyAssignment_5_3
            {
            pushFollow(FOLLOW_2);
            rule__Task__DependencyAssignment_5_3();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getDependencyAssignment_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_5__3__Impl"


    // $ANTLR start "rule__Task__Group_6__0"
    // InternalGpx.g:947:1: rule__Task__Group_6__0 : rule__Task__Group_6__0__Impl rule__Task__Group_6__1 ;
    public final void rule__Task__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:951:1: ( rule__Task__Group_6__0__Impl rule__Task__Group_6__1 )
            // InternalGpx.g:952:2: rule__Task__Group_6__0__Impl rule__Task__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Task__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_6__0"


    // $ANTLR start "rule__Task__Group_6__0__Impl"
    // InternalGpx.g:959:1: rule__Task__Group_6__0__Impl : ( '{' ) ;
    public final void rule__Task__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:963:1: ( ( '{' ) )
            // InternalGpx.g:964:1: ( '{' )
            {
            // InternalGpx.g:964:1: ( '{' )
            // InternalGpx.g:965:2: '{'
            {
             before(grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_6_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_6__0__Impl"


    // $ANTLR start "rule__Task__Group_6__1"
    // InternalGpx.g:974:1: rule__Task__Group_6__1 : rule__Task__Group_6__1__Impl rule__Task__Group_6__2 ;
    public final void rule__Task__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:978:1: ( rule__Task__Group_6__1__Impl rule__Task__Group_6__2 )
            // InternalGpx.g:979:2: rule__Task__Group_6__1__Impl rule__Task__Group_6__2
            {
            pushFollow(FOLLOW_12);
            rule__Task__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_6__1"


    // $ANTLR start "rule__Task__Group_6__1__Impl"
    // InternalGpx.g:986:1: rule__Task__Group_6__1__Impl : ( ( rule__Task__SubtasksAssignment_6_1 ) ) ;
    public final void rule__Task__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:990:1: ( ( ( rule__Task__SubtasksAssignment_6_1 ) ) )
            // InternalGpx.g:991:1: ( ( rule__Task__SubtasksAssignment_6_1 ) )
            {
            // InternalGpx.g:991:1: ( ( rule__Task__SubtasksAssignment_6_1 ) )
            // InternalGpx.g:992:2: ( rule__Task__SubtasksAssignment_6_1 )
            {
             before(grammarAccess.getTaskAccess().getSubtasksAssignment_6_1()); 
            // InternalGpx.g:993:2: ( rule__Task__SubtasksAssignment_6_1 )
            // InternalGpx.g:993:3: rule__Task__SubtasksAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__SubtasksAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getSubtasksAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_6__1__Impl"


    // $ANTLR start "rule__Task__Group_6__2"
    // InternalGpx.g:1001:1: rule__Task__Group_6__2 : rule__Task__Group_6__2__Impl rule__Task__Group_6__3 ;
    public final void rule__Task__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1005:1: ( rule__Task__Group_6__2__Impl rule__Task__Group_6__3 )
            // InternalGpx.g:1006:2: rule__Task__Group_6__2__Impl rule__Task__Group_6__3
            {
            pushFollow(FOLLOW_12);
            rule__Task__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_6__2"


    // $ANTLR start "rule__Task__Group_6__2__Impl"
    // InternalGpx.g:1013:1: rule__Task__Group_6__2__Impl : ( ( rule__Task__Group_6_2__0 )* ) ;
    public final void rule__Task__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1017:1: ( ( ( rule__Task__Group_6_2__0 )* ) )
            // InternalGpx.g:1018:1: ( ( rule__Task__Group_6_2__0 )* )
            {
            // InternalGpx.g:1018:1: ( ( rule__Task__Group_6_2__0 )* )
            // InternalGpx.g:1019:2: ( rule__Task__Group_6_2__0 )*
            {
             before(grammarAccess.getTaskAccess().getGroup_6_2()); 
            // InternalGpx.g:1020:2: ( rule__Task__Group_6_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGpx.g:1020:3: rule__Task__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Task__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getTaskAccess().getGroup_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_6__2__Impl"


    // $ANTLR start "rule__Task__Group_6__3"
    // InternalGpx.g:1028:1: rule__Task__Group_6__3 : rule__Task__Group_6__3__Impl ;
    public final void rule__Task__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1032:1: ( rule__Task__Group_6__3__Impl )
            // InternalGpx.g:1033:2: rule__Task__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_6__3"


    // $ANTLR start "rule__Task__Group_6__3__Impl"
    // InternalGpx.g:1039:1: rule__Task__Group_6__3__Impl : ( '}' ) ;
    public final void rule__Task__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1043:1: ( ( '}' ) )
            // InternalGpx.g:1044:1: ( '}' )
            {
            // InternalGpx.g:1044:1: ( '}' )
            // InternalGpx.g:1045:2: '}'
            {
             before(grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_6_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_6__3__Impl"


    // $ANTLR start "rule__Task__Group_6_2__0"
    // InternalGpx.g:1055:1: rule__Task__Group_6_2__0 : rule__Task__Group_6_2__0__Impl rule__Task__Group_6_2__1 ;
    public final void rule__Task__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1059:1: ( rule__Task__Group_6_2__0__Impl rule__Task__Group_6_2__1 )
            // InternalGpx.g:1060:2: rule__Task__Group_6_2__0__Impl rule__Task__Group_6_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Task__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_6_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_6_2__0"


    // $ANTLR start "rule__Task__Group_6_2__0__Impl"
    // InternalGpx.g:1067:1: rule__Task__Group_6_2__0__Impl : ( ';' ) ;
    public final void rule__Task__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1071:1: ( ( ';' ) )
            // InternalGpx.g:1072:1: ( ';' )
            {
            // InternalGpx.g:1072:1: ( ';' )
            // InternalGpx.g:1073:2: ';'
            {
             before(grammarAccess.getTaskAccess().getSemicolonKeyword_6_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getSemicolonKeyword_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_6_2__0__Impl"


    // $ANTLR start "rule__Task__Group_6_2__1"
    // InternalGpx.g:1082:1: rule__Task__Group_6_2__1 : rule__Task__Group_6_2__1__Impl ;
    public final void rule__Task__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1086:1: ( rule__Task__Group_6_2__1__Impl )
            // InternalGpx.g:1087:2: rule__Task__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group_6_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_6_2__1"


    // $ANTLR start "rule__Task__Group_6_2__1__Impl"
    // InternalGpx.g:1093:1: rule__Task__Group_6_2__1__Impl : ( ( rule__Task__SubtasksAssignment_6_2_1 ) ) ;
    public final void rule__Task__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1097:1: ( ( ( rule__Task__SubtasksAssignment_6_2_1 ) ) )
            // InternalGpx.g:1098:1: ( ( rule__Task__SubtasksAssignment_6_2_1 ) )
            {
            // InternalGpx.g:1098:1: ( ( rule__Task__SubtasksAssignment_6_2_1 ) )
            // InternalGpx.g:1099:2: ( rule__Task__SubtasksAssignment_6_2_1 )
            {
             before(grammarAccess.getTaskAccess().getSubtasksAssignment_6_2_1()); 
            // InternalGpx.g:1100:2: ( rule__Task__SubtasksAssignment_6_2_1 )
            // InternalGpx.g:1100:3: rule__Task__SubtasksAssignment_6_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__SubtasksAssignment_6_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getSubtasksAssignment_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_6_2__1__Impl"


    // $ANTLR start "rule__Milestone__Group__0"
    // InternalGpx.g:1109:1: rule__Milestone__Group__0 : rule__Milestone__Group__0__Impl rule__Milestone__Group__1 ;
    public final void rule__Milestone__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1113:1: ( rule__Milestone__Group__0__Impl rule__Milestone__Group__1 )
            // InternalGpx.g:1114:2: rule__Milestone__Group__0__Impl rule__Milestone__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Milestone__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Milestone__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Milestone__Group__0"


    // $ANTLR start "rule__Milestone__Group__0__Impl"
    // InternalGpx.g:1121:1: rule__Milestone__Group__0__Impl : ( 'Milestone' ) ;
    public final void rule__Milestone__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1125:1: ( ( 'Milestone' ) )
            // InternalGpx.g:1126:1: ( 'Milestone' )
            {
            // InternalGpx.g:1126:1: ( 'Milestone' )
            // InternalGpx.g:1127:2: 'Milestone'
            {
             before(grammarAccess.getMilestoneAccess().getMilestoneKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMilestoneAccess().getMilestoneKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Milestone__Group__0__Impl"


    // $ANTLR start "rule__Milestone__Group__1"
    // InternalGpx.g:1136:1: rule__Milestone__Group__1 : rule__Milestone__Group__1__Impl rule__Milestone__Group__2 ;
    public final void rule__Milestone__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1140:1: ( rule__Milestone__Group__1__Impl rule__Milestone__Group__2 )
            // InternalGpx.g:1141:2: rule__Milestone__Group__1__Impl rule__Milestone__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Milestone__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Milestone__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Milestone__Group__1"


    // $ANTLR start "rule__Milestone__Group__1__Impl"
    // InternalGpx.g:1148:1: rule__Milestone__Group__1__Impl : ( ( rule__Milestone__NameAssignment_1 ) ) ;
    public final void rule__Milestone__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1152:1: ( ( ( rule__Milestone__NameAssignment_1 ) ) )
            // InternalGpx.g:1153:1: ( ( rule__Milestone__NameAssignment_1 ) )
            {
            // InternalGpx.g:1153:1: ( ( rule__Milestone__NameAssignment_1 ) )
            // InternalGpx.g:1154:2: ( rule__Milestone__NameAssignment_1 )
            {
             before(grammarAccess.getMilestoneAccess().getNameAssignment_1()); 
            // InternalGpx.g:1155:2: ( rule__Milestone__NameAssignment_1 )
            // InternalGpx.g:1155:3: rule__Milestone__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Milestone__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMilestoneAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Milestone__Group__1__Impl"


    // $ANTLR start "rule__Milestone__Group__2"
    // InternalGpx.g:1163:1: rule__Milestone__Group__2 : rule__Milestone__Group__2__Impl rule__Milestone__Group__3 ;
    public final void rule__Milestone__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1167:1: ( rule__Milestone__Group__2__Impl rule__Milestone__Group__3 )
            // InternalGpx.g:1168:2: rule__Milestone__Group__2__Impl rule__Milestone__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Milestone__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Milestone__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Milestone__Group__2"


    // $ANTLR start "rule__Milestone__Group__2__Impl"
    // InternalGpx.g:1175:1: rule__Milestone__Group__2__Impl : ( 'planned' ) ;
    public final void rule__Milestone__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1179:1: ( ( 'planned' ) )
            // InternalGpx.g:1180:1: ( 'planned' )
            {
            // InternalGpx.g:1180:1: ( 'planned' )
            // InternalGpx.g:1181:2: 'planned'
            {
             before(grammarAccess.getMilestoneAccess().getPlannedKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMilestoneAccess().getPlannedKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Milestone__Group__2__Impl"


    // $ANTLR start "rule__Milestone__Group__3"
    // InternalGpx.g:1190:1: rule__Milestone__Group__3 : rule__Milestone__Group__3__Impl rule__Milestone__Group__4 ;
    public final void rule__Milestone__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1194:1: ( rule__Milestone__Group__3__Impl rule__Milestone__Group__4 )
            // InternalGpx.g:1195:2: rule__Milestone__Group__3__Impl rule__Milestone__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Milestone__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Milestone__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Milestone__Group__3"


    // $ANTLR start "rule__Milestone__Group__3__Impl"
    // InternalGpx.g:1202:1: rule__Milestone__Group__3__Impl : ( ( rule__Milestone__EndDateAssignment_3 ) ) ;
    public final void rule__Milestone__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1206:1: ( ( ( rule__Milestone__EndDateAssignment_3 ) ) )
            // InternalGpx.g:1207:1: ( ( rule__Milestone__EndDateAssignment_3 ) )
            {
            // InternalGpx.g:1207:1: ( ( rule__Milestone__EndDateAssignment_3 ) )
            // InternalGpx.g:1208:2: ( rule__Milestone__EndDateAssignment_3 )
            {
             before(grammarAccess.getMilestoneAccess().getEndDateAssignment_3()); 
            // InternalGpx.g:1209:2: ( rule__Milestone__EndDateAssignment_3 )
            // InternalGpx.g:1209:3: rule__Milestone__EndDateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Milestone__EndDateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMilestoneAccess().getEndDateAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Milestone__Group__3__Impl"


    // $ANTLR start "rule__Milestone__Group__4"
    // InternalGpx.g:1217:1: rule__Milestone__Group__4 : rule__Milestone__Group__4__Impl ;
    public final void rule__Milestone__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1221:1: ( rule__Milestone__Group__4__Impl )
            // InternalGpx.g:1222:2: rule__Milestone__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Milestone__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Milestone__Group__4"


    // $ANTLR start "rule__Milestone__Group__4__Impl"
    // InternalGpx.g:1228:1: rule__Milestone__Group__4__Impl : ( ( rule__Milestone__Group_4__0 )? ) ;
    public final void rule__Milestone__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1232:1: ( ( ( rule__Milestone__Group_4__0 )? ) )
            // InternalGpx.g:1233:1: ( ( rule__Milestone__Group_4__0 )? )
            {
            // InternalGpx.g:1233:1: ( ( rule__Milestone__Group_4__0 )? )
            // InternalGpx.g:1234:2: ( rule__Milestone__Group_4__0 )?
            {
             before(grammarAccess.getMilestoneAccess().getGroup_4()); 
            // InternalGpx.g:1235:2: ( rule__Milestone__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=21 && LA12_0<=22)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGpx.g:1235:3: rule__Milestone__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Milestone__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMilestoneAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Milestone__Group__4__Impl"


    // $ANTLR start "rule__Milestone__Group_4__0"
    // InternalGpx.g:1244:1: rule__Milestone__Group_4__0 : rule__Milestone__Group_4__0__Impl rule__Milestone__Group_4__1 ;
    public final void rule__Milestone__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1248:1: ( rule__Milestone__Group_4__0__Impl rule__Milestone__Group_4__1 )
            // InternalGpx.g:1249:2: rule__Milestone__Group_4__0__Impl rule__Milestone__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__Milestone__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Milestone__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Milestone__Group_4__0"


    // $ANTLR start "rule__Milestone__Group_4__0__Impl"
    // InternalGpx.g:1256:1: rule__Milestone__Group_4__0__Impl : ( ( ',' )? ) ;
    public final void rule__Milestone__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1260:1: ( ( ( ',' )? ) )
            // InternalGpx.g:1261:1: ( ( ',' )? )
            {
            // InternalGpx.g:1261:1: ( ( ',' )? )
            // InternalGpx.g:1262:2: ( ',' )?
            {
             before(grammarAccess.getMilestoneAccess().getCommaKeyword_4_0()); 
            // InternalGpx.g:1263:2: ( ',' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGpx.g:1263:3: ','
                    {
                    match(input,21,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getMilestoneAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Milestone__Group_4__0__Impl"


    // $ANTLR start "rule__Milestone__Group_4__1"
    // InternalGpx.g:1271:1: rule__Milestone__Group_4__1 : rule__Milestone__Group_4__1__Impl rule__Milestone__Group_4__2 ;
    public final void rule__Milestone__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1275:1: ( rule__Milestone__Group_4__1__Impl rule__Milestone__Group_4__2 )
            // InternalGpx.g:1276:2: rule__Milestone__Group_4__1__Impl rule__Milestone__Group_4__2
            {
            pushFollow(FOLLOW_11);
            rule__Milestone__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Milestone__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Milestone__Group_4__1"


    // $ANTLR start "rule__Milestone__Group_4__1__Impl"
    // InternalGpx.g:1283:1: rule__Milestone__Group_4__1__Impl : ( 'depends' ) ;
    public final void rule__Milestone__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1287:1: ( ( 'depends' ) )
            // InternalGpx.g:1288:1: ( 'depends' )
            {
            // InternalGpx.g:1288:1: ( 'depends' )
            // InternalGpx.g:1289:2: 'depends'
            {
             before(grammarAccess.getMilestoneAccess().getDependsKeyword_4_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMilestoneAccess().getDependsKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Milestone__Group_4__1__Impl"


    // $ANTLR start "rule__Milestone__Group_4__2"
    // InternalGpx.g:1298:1: rule__Milestone__Group_4__2 : rule__Milestone__Group_4__2__Impl rule__Milestone__Group_4__3 ;
    public final void rule__Milestone__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1302:1: ( rule__Milestone__Group_4__2__Impl rule__Milestone__Group_4__3 )
            // InternalGpx.g:1303:2: rule__Milestone__Group_4__2__Impl rule__Milestone__Group_4__3
            {
            pushFollow(FOLLOW_3);
            rule__Milestone__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Milestone__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Milestone__Group_4__2"


    // $ANTLR start "rule__Milestone__Group_4__2__Impl"
    // InternalGpx.g:1310:1: rule__Milestone__Group_4__2__Impl : ( 'on' ) ;
    public final void rule__Milestone__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1314:1: ( ( 'on' ) )
            // InternalGpx.g:1315:1: ( 'on' )
            {
            // InternalGpx.g:1315:1: ( 'on' )
            // InternalGpx.g:1316:2: 'on'
            {
             before(grammarAccess.getMilestoneAccess().getOnKeyword_4_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMilestoneAccess().getOnKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Milestone__Group_4__2__Impl"


    // $ANTLR start "rule__Milestone__Group_4__3"
    // InternalGpx.g:1325:1: rule__Milestone__Group_4__3 : rule__Milestone__Group_4__3__Impl ;
    public final void rule__Milestone__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1329:1: ( rule__Milestone__Group_4__3__Impl )
            // InternalGpx.g:1330:2: rule__Milestone__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Milestone__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Milestone__Group_4__3"


    // $ANTLR start "rule__Milestone__Group_4__3__Impl"
    // InternalGpx.g:1336:1: rule__Milestone__Group_4__3__Impl : ( ( rule__Milestone__DependencyAssignment_4_3 ) ) ;
    public final void rule__Milestone__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1340:1: ( ( ( rule__Milestone__DependencyAssignment_4_3 ) ) )
            // InternalGpx.g:1341:1: ( ( rule__Milestone__DependencyAssignment_4_3 ) )
            {
            // InternalGpx.g:1341:1: ( ( rule__Milestone__DependencyAssignment_4_3 ) )
            // InternalGpx.g:1342:2: ( rule__Milestone__DependencyAssignment_4_3 )
            {
             before(grammarAccess.getMilestoneAccess().getDependencyAssignment_4_3()); 
            // InternalGpx.g:1343:2: ( rule__Milestone__DependencyAssignment_4_3 )
            // InternalGpx.g:1343:3: rule__Milestone__DependencyAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__Milestone__DependencyAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getMilestoneAccess().getDependencyAssignment_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Milestone__Group_4__3__Impl"


    // $ANTLR start "rule__Dependency__Group__0"
    // InternalGpx.g:1352:1: rule__Dependency__Group__0 : rule__Dependency__Group__0__Impl rule__Dependency__Group__1 ;
    public final void rule__Dependency__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1356:1: ( rule__Dependency__Group__0__Impl rule__Dependency__Group__1 )
            // InternalGpx.g:1357:2: rule__Dependency__Group__0__Impl rule__Dependency__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Dependency__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dependency__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__0"


    // $ANTLR start "rule__Dependency__Group__0__Impl"
    // InternalGpx.g:1364:1: rule__Dependency__Group__0__Impl : ( ( rule__Dependency__MasterAssignment_0 ) ) ;
    public final void rule__Dependency__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1368:1: ( ( ( rule__Dependency__MasterAssignment_0 ) ) )
            // InternalGpx.g:1369:1: ( ( rule__Dependency__MasterAssignment_0 ) )
            {
            // InternalGpx.g:1369:1: ( ( rule__Dependency__MasterAssignment_0 ) )
            // InternalGpx.g:1370:2: ( rule__Dependency__MasterAssignment_0 )
            {
             before(grammarAccess.getDependencyAccess().getMasterAssignment_0()); 
            // InternalGpx.g:1371:2: ( rule__Dependency__MasterAssignment_0 )
            // InternalGpx.g:1371:3: rule__Dependency__MasterAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Dependency__MasterAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDependencyAccess().getMasterAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__0__Impl"


    // $ANTLR start "rule__Dependency__Group__1"
    // InternalGpx.g:1379:1: rule__Dependency__Group__1 : rule__Dependency__Group__1__Impl ;
    public final void rule__Dependency__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1383:1: ( rule__Dependency__Group__1__Impl )
            // InternalGpx.g:1384:2: rule__Dependency__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dependency__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__1"


    // $ANTLR start "rule__Dependency__Group__1__Impl"
    // InternalGpx.g:1390:1: rule__Dependency__Group__1__Impl : ( ( rule__Dependency__Group_1__0 )* ) ;
    public final void rule__Dependency__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1394:1: ( ( ( rule__Dependency__Group_1__0 )* ) )
            // InternalGpx.g:1395:1: ( ( rule__Dependency__Group_1__0 )* )
            {
            // InternalGpx.g:1395:1: ( ( rule__Dependency__Group_1__0 )* )
            // InternalGpx.g:1396:2: ( rule__Dependency__Group_1__0 )*
            {
             before(grammarAccess.getDependencyAccess().getGroup_1()); 
            // InternalGpx.g:1397:2: ( rule__Dependency__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGpx.g:1397:3: rule__Dependency__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Dependency__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getDependencyAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__1__Impl"


    // $ANTLR start "rule__Dependency__Group_1__0"
    // InternalGpx.g:1406:1: rule__Dependency__Group_1__0 : rule__Dependency__Group_1__0__Impl rule__Dependency__Group_1__1 ;
    public final void rule__Dependency__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1410:1: ( rule__Dependency__Group_1__0__Impl rule__Dependency__Group_1__1 )
            // InternalGpx.g:1411:2: rule__Dependency__Group_1__0__Impl rule__Dependency__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Dependency__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dependency__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group_1__0"


    // $ANTLR start "rule__Dependency__Group_1__0__Impl"
    // InternalGpx.g:1418:1: rule__Dependency__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Dependency__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1422:1: ( ( ',' ) )
            // InternalGpx.g:1423:1: ( ',' )
            {
            // InternalGpx.g:1423:1: ( ',' )
            // InternalGpx.g:1424:2: ','
            {
             before(grammarAccess.getDependencyAccess().getCommaKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDependencyAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group_1__0__Impl"


    // $ANTLR start "rule__Dependency__Group_1__1"
    // InternalGpx.g:1433:1: rule__Dependency__Group_1__1 : rule__Dependency__Group_1__1__Impl ;
    public final void rule__Dependency__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1437:1: ( rule__Dependency__Group_1__1__Impl )
            // InternalGpx.g:1438:2: rule__Dependency__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dependency__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group_1__1"


    // $ANTLR start "rule__Dependency__Group_1__1__Impl"
    // InternalGpx.g:1444:1: rule__Dependency__Group_1__1__Impl : ( ( rule__Dependency__MasterAssignment_1_1 ) ) ;
    public final void rule__Dependency__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1448:1: ( ( ( rule__Dependency__MasterAssignment_1_1 ) ) )
            // InternalGpx.g:1449:1: ( ( rule__Dependency__MasterAssignment_1_1 ) )
            {
            // InternalGpx.g:1449:1: ( ( rule__Dependency__MasterAssignment_1_1 ) )
            // InternalGpx.g:1450:2: ( rule__Dependency__MasterAssignment_1_1 )
            {
             before(grammarAccess.getDependencyAccess().getMasterAssignment_1_1()); 
            // InternalGpx.g:1451:2: ( rule__Dependency__MasterAssignment_1_1 )
            // InternalGpx.g:1451:3: rule__Dependency__MasterAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Dependency__MasterAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDependencyAccess().getMasterAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group_1__1__Impl"


    // $ANTLR start "rule__Date__Group__0"
    // InternalGpx.g:1460:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
    public final void rule__Date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1464:1: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
            // InternalGpx.g:1465:2: rule__Date__Group__0__Impl rule__Date__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Date__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__0"


    // $ANTLR start "rule__Date__Group__0__Impl"
    // InternalGpx.g:1472:1: rule__Date__Group__0__Impl : ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) ) ;
    public final void rule__Date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1476:1: ( ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) ) )
            // InternalGpx.g:1477:1: ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) )
            {
            // InternalGpx.g:1477:1: ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) )
            // InternalGpx.g:1478:2: ( ( RULE_INT ) ) ( ( RULE_INT )* )
            {
            // InternalGpx.g:1478:2: ( ( RULE_INT ) )
            // InternalGpx.g:1479:3: ( RULE_INT )
            {
             before(grammarAccess.getDateAccess().getINTTerminalRuleCall_0()); 
            // InternalGpx.g:1480:3: ( RULE_INT )
            // InternalGpx.g:1480:4: RULE_INT
            {
            match(input,RULE_INT,FOLLOW_17); 

            }

             after(grammarAccess.getDateAccess().getINTTerminalRuleCall_0()); 

            }

            // InternalGpx.g:1483:2: ( ( RULE_INT )* )
            // InternalGpx.g:1484:3: ( RULE_INT )*
            {
             before(grammarAccess.getDateAccess().getINTTerminalRuleCall_0()); 
            // InternalGpx.g:1485:3: ( RULE_INT )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_INT) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGpx.g:1485:4: RULE_INT
            	    {
            	    match(input,RULE_INT,FOLLOW_17); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getDateAccess().getINTTerminalRuleCall_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__0__Impl"


    // $ANTLR start "rule__Date__Group__1"
    // InternalGpx.g:1494:1: rule__Date__Group__1 : rule__Date__Group__1__Impl rule__Date__Group__2 ;
    public final void rule__Date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1498:1: ( rule__Date__Group__1__Impl rule__Date__Group__2 )
            // InternalGpx.g:1499:2: rule__Date__Group__1__Impl rule__Date__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Date__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__1"


    // $ANTLR start "rule__Date__Group__1__Impl"
    // InternalGpx.g:1506:1: rule__Date__Group__1__Impl : ( '.' ) ;
    public final void rule__Date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1510:1: ( ( '.' ) )
            // InternalGpx.g:1511:1: ( '.' )
            {
            // InternalGpx.g:1511:1: ( '.' )
            // InternalGpx.g:1512:2: '.'
            {
             before(grammarAccess.getDateAccess().getFullStopKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__1__Impl"


    // $ANTLR start "rule__Date__Group__2"
    // InternalGpx.g:1521:1: rule__Date__Group__2 : rule__Date__Group__2__Impl rule__Date__Group__3 ;
    public final void rule__Date__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1525:1: ( rule__Date__Group__2__Impl rule__Date__Group__3 )
            // InternalGpx.g:1526:2: rule__Date__Group__2__Impl rule__Date__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Date__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__2"


    // $ANTLR start "rule__Date__Group__2__Impl"
    // InternalGpx.g:1533:1: rule__Date__Group__2__Impl : ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) ) ;
    public final void rule__Date__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1537:1: ( ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) ) )
            // InternalGpx.g:1538:1: ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) )
            {
            // InternalGpx.g:1538:1: ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) )
            // InternalGpx.g:1539:2: ( ( RULE_INT ) ) ( ( RULE_INT )* )
            {
            // InternalGpx.g:1539:2: ( ( RULE_INT ) )
            // InternalGpx.g:1540:3: ( RULE_INT )
            {
             before(grammarAccess.getDateAccess().getINTTerminalRuleCall_2()); 
            // InternalGpx.g:1541:3: ( RULE_INT )
            // InternalGpx.g:1541:4: RULE_INT
            {
            match(input,RULE_INT,FOLLOW_17); 

            }

             after(grammarAccess.getDateAccess().getINTTerminalRuleCall_2()); 

            }

            // InternalGpx.g:1544:2: ( ( RULE_INT )* )
            // InternalGpx.g:1545:3: ( RULE_INT )*
            {
             before(grammarAccess.getDateAccess().getINTTerminalRuleCall_2()); 
            // InternalGpx.g:1546:3: ( RULE_INT )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_INT) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGpx.g:1546:4: RULE_INT
            	    {
            	    match(input,RULE_INT,FOLLOW_17); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getDateAccess().getINTTerminalRuleCall_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__2__Impl"


    // $ANTLR start "rule__Date__Group__3"
    // InternalGpx.g:1555:1: rule__Date__Group__3 : rule__Date__Group__3__Impl rule__Date__Group__4 ;
    public final void rule__Date__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1559:1: ( rule__Date__Group__3__Impl rule__Date__Group__4 )
            // InternalGpx.g:1560:2: rule__Date__Group__3__Impl rule__Date__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Date__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__3"


    // $ANTLR start "rule__Date__Group__3__Impl"
    // InternalGpx.g:1567:1: rule__Date__Group__3__Impl : ( '.' ) ;
    public final void rule__Date__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1571:1: ( ( '.' ) )
            // InternalGpx.g:1572:1: ( '.' )
            {
            // InternalGpx.g:1572:1: ( '.' )
            // InternalGpx.g:1573:2: '.'
            {
             before(grammarAccess.getDateAccess().getFullStopKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getFullStopKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__3__Impl"


    // $ANTLR start "rule__Date__Group__4"
    // InternalGpx.g:1582:1: rule__Date__Group__4 : rule__Date__Group__4__Impl ;
    public final void rule__Date__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1586:1: ( rule__Date__Group__4__Impl )
            // InternalGpx.g:1587:2: rule__Date__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Date__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__4"


    // $ANTLR start "rule__Date__Group__4__Impl"
    // InternalGpx.g:1593:1: rule__Date__Group__4__Impl : ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) ) ;
    public final void rule__Date__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1597:1: ( ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) ) )
            // InternalGpx.g:1598:1: ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) )
            {
            // InternalGpx.g:1598:1: ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) )
            // InternalGpx.g:1599:2: ( ( RULE_INT ) ) ( ( RULE_INT )* )
            {
            // InternalGpx.g:1599:2: ( ( RULE_INT ) )
            // InternalGpx.g:1600:3: ( RULE_INT )
            {
             before(grammarAccess.getDateAccess().getINTTerminalRuleCall_4()); 
            // InternalGpx.g:1601:3: ( RULE_INT )
            // InternalGpx.g:1601:4: RULE_INT
            {
            match(input,RULE_INT,FOLLOW_17); 

            }

             after(grammarAccess.getDateAccess().getINTTerminalRuleCall_4()); 

            }

            // InternalGpx.g:1604:2: ( ( RULE_INT )* )
            // InternalGpx.g:1605:3: ( RULE_INT )*
            {
             before(grammarAccess.getDateAccess().getINTTerminalRuleCall_4()); 
            // InternalGpx.g:1606:3: ( RULE_INT )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_INT) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGpx.g:1606:4: RULE_INT
            	    {
            	    match(input,RULE_INT,FOLLOW_17); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getDateAccess().getINTTerminalRuleCall_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__4__Impl"


    // $ANTLR start "rule__Project__NameAssignment_1"
    // InternalGpx.g:1616:1: rule__Project__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Project__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1620:1: ( ( RULE_STRING ) )
            // InternalGpx.g:1621:2: ( RULE_STRING )
            {
            // InternalGpx.g:1621:2: ( RULE_STRING )
            // InternalGpx.g:1622:3: RULE_STRING
            {
             before(grammarAccess.getProjectAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__NameAssignment_1"


    // $ANTLR start "rule__Project__TasksAssignment_2_0"
    // InternalGpx.g:1631:1: rule__Project__TasksAssignment_2_0 : ( ruleAbstractTask ) ;
    public final void rule__Project__TasksAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1635:1: ( ( ruleAbstractTask ) )
            // InternalGpx.g:1636:2: ( ruleAbstractTask )
            {
            // InternalGpx.g:1636:2: ( ruleAbstractTask )
            // InternalGpx.g:1637:3: ruleAbstractTask
            {
             before(grammarAccess.getProjectAccess().getTasksAbstractTaskParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractTask();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getTasksAbstractTaskParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__TasksAssignment_2_0"


    // $ANTLR start "rule__Project__TasksAssignment_2_1_1"
    // InternalGpx.g:1646:1: rule__Project__TasksAssignment_2_1_1 : ( ruleAbstractTask ) ;
    public final void rule__Project__TasksAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1650:1: ( ( ruleAbstractTask ) )
            // InternalGpx.g:1651:2: ( ruleAbstractTask )
            {
            // InternalGpx.g:1651:2: ( ruleAbstractTask )
            // InternalGpx.g:1652:3: ruleAbstractTask
            {
             before(grammarAccess.getProjectAccess().getTasksAbstractTaskParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractTask();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getTasksAbstractTaskParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__TasksAssignment_2_1_1"


    // $ANTLR start "rule__Task__NameAssignment_1"
    // InternalGpx.g:1661:1: rule__Task__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Task__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1665:1: ( ( RULE_STRING ) )
            // InternalGpx.g:1666:2: ( RULE_STRING )
            {
            // InternalGpx.g:1666:2: ( RULE_STRING )
            // InternalGpx.g:1667:3: RULE_STRING
            {
             before(grammarAccess.getTaskAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__NameAssignment_1"


    // $ANTLR start "rule__Task__DurationAssignment_2_1"
    // InternalGpx.g:1676:1: rule__Task__DurationAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Task__DurationAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1680:1: ( ( RULE_INT ) )
            // InternalGpx.g:1681:2: ( RULE_INT )
            {
            // InternalGpx.g:1681:2: ( RULE_INT )
            // InternalGpx.g:1682:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getDurationINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getDurationINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__DurationAssignment_2_1"


    // $ANTLR start "rule__Task__DurationUnitAssignment_2_2"
    // InternalGpx.g:1691:1: rule__Task__DurationUnitAssignment_2_2 : ( ruleDURATION_UNIT ) ;
    public final void rule__Task__DurationUnitAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1695:1: ( ( ruleDURATION_UNIT ) )
            // InternalGpx.g:1696:2: ( ruleDURATION_UNIT )
            {
            // InternalGpx.g:1696:2: ( ruleDURATION_UNIT )
            // InternalGpx.g:1697:3: ruleDURATION_UNIT
            {
             before(grammarAccess.getTaskAccess().getDurationUnitDURATION_UNITEnumRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDURATION_UNIT();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getDurationUnitDURATION_UNITEnumRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__DurationUnitAssignment_2_2"


    // $ANTLR start "rule__Task__StartDateAssignment_3_1"
    // InternalGpx.g:1706:1: rule__Task__StartDateAssignment_3_1 : ( ruleDate ) ;
    public final void rule__Task__StartDateAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1710:1: ( ( ruleDate ) )
            // InternalGpx.g:1711:2: ( ruleDate )
            {
            // InternalGpx.g:1711:2: ( ruleDate )
            // InternalGpx.g:1712:3: ruleDate
            {
             before(grammarAccess.getTaskAccess().getStartDateDateParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getStartDateDateParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__StartDateAssignment_3_1"


    // $ANTLR start "rule__Task__EndDateAssignment_4_1"
    // InternalGpx.g:1721:1: rule__Task__EndDateAssignment_4_1 : ( ruleDate ) ;
    public final void rule__Task__EndDateAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1725:1: ( ( ruleDate ) )
            // InternalGpx.g:1726:2: ( ruleDate )
            {
            // InternalGpx.g:1726:2: ( ruleDate )
            // InternalGpx.g:1727:3: ruleDate
            {
             before(grammarAccess.getTaskAccess().getEndDateDateParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getEndDateDateParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__EndDateAssignment_4_1"


    // $ANTLR start "rule__Task__DependencyAssignment_5_3"
    // InternalGpx.g:1736:1: rule__Task__DependencyAssignment_5_3 : ( ruleDependency ) ;
    public final void rule__Task__DependencyAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1740:1: ( ( ruleDependency ) )
            // InternalGpx.g:1741:2: ( ruleDependency )
            {
            // InternalGpx.g:1741:2: ( ruleDependency )
            // InternalGpx.g:1742:3: ruleDependency
            {
             before(grammarAccess.getTaskAccess().getDependencyDependencyParserRuleCall_5_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getDependencyDependencyParserRuleCall_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__DependencyAssignment_5_3"


    // $ANTLR start "rule__Task__SubtasksAssignment_6_1"
    // InternalGpx.g:1751:1: rule__Task__SubtasksAssignment_6_1 : ( ruleAbstractTask ) ;
    public final void rule__Task__SubtasksAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1755:1: ( ( ruleAbstractTask ) )
            // InternalGpx.g:1756:2: ( ruleAbstractTask )
            {
            // InternalGpx.g:1756:2: ( ruleAbstractTask )
            // InternalGpx.g:1757:3: ruleAbstractTask
            {
             before(grammarAccess.getTaskAccess().getSubtasksAbstractTaskParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractTask();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getSubtasksAbstractTaskParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__SubtasksAssignment_6_1"


    // $ANTLR start "rule__Task__SubtasksAssignment_6_2_1"
    // InternalGpx.g:1766:1: rule__Task__SubtasksAssignment_6_2_1 : ( ruleAbstractTask ) ;
    public final void rule__Task__SubtasksAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1770:1: ( ( ruleAbstractTask ) )
            // InternalGpx.g:1771:2: ( ruleAbstractTask )
            {
            // InternalGpx.g:1771:2: ( ruleAbstractTask )
            // InternalGpx.g:1772:3: ruleAbstractTask
            {
             before(grammarAccess.getTaskAccess().getSubtasksAbstractTaskParserRuleCall_6_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractTask();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getSubtasksAbstractTaskParserRuleCall_6_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__SubtasksAssignment_6_2_1"


    // $ANTLR start "rule__Milestone__NameAssignment_1"
    // InternalGpx.g:1781:1: rule__Milestone__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Milestone__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1785:1: ( ( RULE_STRING ) )
            // InternalGpx.g:1786:2: ( RULE_STRING )
            {
            // InternalGpx.g:1786:2: ( RULE_STRING )
            // InternalGpx.g:1787:3: RULE_STRING
            {
             before(grammarAccess.getMilestoneAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMilestoneAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Milestone__NameAssignment_1"


    // $ANTLR start "rule__Milestone__EndDateAssignment_3"
    // InternalGpx.g:1796:1: rule__Milestone__EndDateAssignment_3 : ( ruleDate ) ;
    public final void rule__Milestone__EndDateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1800:1: ( ( ruleDate ) )
            // InternalGpx.g:1801:2: ( ruleDate )
            {
            // InternalGpx.g:1801:2: ( ruleDate )
            // InternalGpx.g:1802:3: ruleDate
            {
             before(grammarAccess.getMilestoneAccess().getEndDateDateParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getMilestoneAccess().getEndDateDateParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Milestone__EndDateAssignment_3"


    // $ANTLR start "rule__Milestone__DependencyAssignment_4_3"
    // InternalGpx.g:1811:1: rule__Milestone__DependencyAssignment_4_3 : ( ruleDependency ) ;
    public final void rule__Milestone__DependencyAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1815:1: ( ( ruleDependency ) )
            // InternalGpx.g:1816:2: ( ruleDependency )
            {
            // InternalGpx.g:1816:2: ( ruleDependency )
            // InternalGpx.g:1817:3: ruleDependency
            {
             before(grammarAccess.getMilestoneAccess().getDependencyDependencyParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getMilestoneAccess().getDependencyDependencyParserRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Milestone__DependencyAssignment_4_3"


    // $ANTLR start "rule__Dependency__MasterAssignment_0"
    // InternalGpx.g:1826:1: rule__Dependency__MasterAssignment_0 : ( ( RULE_STRING ) ) ;
    public final void rule__Dependency__MasterAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1830:1: ( ( ( RULE_STRING ) ) )
            // InternalGpx.g:1831:2: ( ( RULE_STRING ) )
            {
            // InternalGpx.g:1831:2: ( ( RULE_STRING ) )
            // InternalGpx.g:1832:3: ( RULE_STRING )
            {
             before(grammarAccess.getDependencyAccess().getMasterAbstractTaskCrossReference_0_0()); 
            // InternalGpx.g:1833:3: ( RULE_STRING )
            // InternalGpx.g:1834:4: RULE_STRING
            {
             before(grammarAccess.getDependencyAccess().getMasterAbstractTaskSTRINGTerminalRuleCall_0_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDependencyAccess().getMasterAbstractTaskSTRINGTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getDependencyAccess().getMasterAbstractTaskCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__MasterAssignment_0"


    // $ANTLR start "rule__Dependency__MasterAssignment_1_1"
    // InternalGpx.g:1845:1: rule__Dependency__MasterAssignment_1_1 : ( ( RULE_STRING ) ) ;
    public final void rule__Dependency__MasterAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGpx.g:1849:1: ( ( ( RULE_STRING ) ) )
            // InternalGpx.g:1850:2: ( ( RULE_STRING ) )
            {
            // InternalGpx.g:1850:2: ( ( RULE_STRING ) )
            // InternalGpx.g:1851:3: ( RULE_STRING )
            {
             before(grammarAccess.getDependencyAccess().getMasterAbstractTaskCrossReference_1_1_0()); 
            // InternalGpx.g:1852:3: ( RULE_STRING )
            // InternalGpx.g:1853:4: RULE_STRING
            {
             before(grammarAccess.getDependencyAccess().getMasterAbstractTaskSTRINGTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDependencyAccess().getMasterAbstractTaskSTRINGTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getDependencyAccess().getMasterAbstractTaskCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__MasterAssignment_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000017C0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000012L});

}