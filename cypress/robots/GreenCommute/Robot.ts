import { BaseHands, BaseEyes, BaseDependencies } from '../BaseRobot';


export class Dependencies extends BaseDependencies {
   
    visitGreenCommute(){
        this.accessUrl(Cypress.env('url'))
            // this.accessUrl("http://bc15-green-commute.dev-apps.io/findJobs")
    }
}

export class RobotEyes extends BaseEyes{
    checkIfNavigatedToPage(){
        this.seesDomContainText("[data-testid='stepper-label']", "Your Location")
    }  

    checkForTextOnNaviationBar(){
        this.hasTextForDom("[data-testid='nav-bar']", "h6", "Green Commute")
    }

    seeIfCheckBoxChecked(dom: string){
        this.seeIfCheckBoxIsChecked(dom)
    }
         
    seesYourSkillFieldValue(data:string) {
        this.seesAttributeValue("[placeholder='Enter your skills']","value", data);
    }

    seesNoOptionsText(data : any) {
        this.seesForText(data.MessageForNoOptions);   
    }

    seeTextOnSaveButton() {
        this.seeTextOnDomIndex("data-testid","button",0,"Save")
    }

    seeForGreenCommuteRouteButton(){
        this.seesDomContainText("[data-testid='job-details']", "Green Commute Routes")
    }

    seeFindJobsPageUrlExtension(){
        this.seeUrlExtension('/findJobs')
    }

    seeSavedJobsPageUrlExtension(){
        this.seeUrlExtension('/savedJobs')
    }

    seeNUmberOfSkillsSelected(count: number){
        this.seesNumberOfElementsInDom("[data-testid='input-field']","MuiFormControl-root MuiTextField-root MuiFormControl-fullWidth", count)
    }
}

export class RobotHands extends BaseHands{

    enterYourLocation(){
        this.typeTextonDom("placeholder", "Enter your location", Cypress.env('locationSearchValue'))
        this.containsClick(".MuiAutocomplete-popper", Cypress.env('locationSelectedValue'))
         
    }

   clickOnNextButton(){
    this. clickOnButtonContainText("Next")
    }

    enterYourJobLocation(){
        this.typeTextonDom("placeholder", "Enter your job location", Cypress.env('locationSearchValue'))
        this.containsClick(".MuiAutocomplete-popper", Cypress.env('locationSelectedValue'))
    }

    enterYourSkills(searchValue: string){
        this.typeTextonDom("placeholder", "Enter your skills", `${searchValue}`)
        this.containsClick(".MuiAutocomplete-popper",  `${searchValue}`)
    }

    enterInvalidSkill(searchValue: string){
        this.typeTextonDom("placeholder", "Enter your skills", `${searchValue}`)
    }

   clickOnFinishButton(){
    this. clickOnButtonContainText("Finish")
    }

    clickOnFilter(){
        this.clickOnDomElement("[data-testid='filterButton']")
    }

    clickOnDistanceCheckBox(distanceValue: string){
        this.selectCheckBox(`[type='checkbox'][name="${distanceValue}"]`)
    }

    clickOnDatePostedCheckBox(){
        this.selectCheckBox(`[name='Anytime'][type='checkbox']`)
    }

    clickOnGreenCommuteCheckBox(){
        this.selectCheckBox(`[name='Yes'][type='checkbox']`)
    }

    clickOnJobTypeCheckBox(){
        this.selectCheckBox("[type='checkbox'][name='Full Time']")
    }

    clickOnExperienceCheckBox(){
        this.selectCheckBox("[type='checkbox'][name='Mid-level']")
    }

    clickOnTransportCheckBox(){
        this.selectCheckBox("[type='checkbox'][name='Motor cycle']")
    }

    clickOnApplyButton(){
        this. clickOnButtonContainText("Apply")
        }

    clickOnClearAll(){
        this.clickOnButtonContainText("clear all")
    } 
    
    clickOnJobCard() {
        this.clickOnDomIndex("data-testid","jobCard-placeholder",0)
    }

    clickOnSaveButton() {
        this.clickOnDomIndex("data-testid","button",0)
    }

    clickOnSavedJobs(){
        this. clickOnButtonContainText("Saved Jobs")
    }

    removeSelectedSkill(){
        this.clickOnDom("[data-testid='custom-chip']", "svg");
    }
}
