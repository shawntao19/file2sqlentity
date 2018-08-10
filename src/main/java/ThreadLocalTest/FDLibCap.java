///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package ThreadLocalTest;
//
//public class FDLibCap {
//
//    public String version;
//
//    public String getVersion() {
//        return this.version;
//    }
//
//    public void setVersion(String version) {
//        this.version = version;
//    }
//
//    public String xmlns;
//
//    public String getXmlns() {
//        return this.xmlns;
//    }
//
//    public void setXmlns(String xmlns) {
//        this.xmlns = xmlns;
//    }
//
//    public CreateFDLibList CreateFDLibList;
//
//    public CreateFDLibList getCreateFDLibList() {
//        return this.CreateFDLibList;
//    }
//
//    public void setCreateFDLibList(CreateFDLibList CreateFDLibList) {
//        this.CreateFDLibList = CreateFDLibList;
//    }
//
//    public FaceAppendData FaceAppendData;
//
//    public FaceAppendData getFaceAppendData() {
//        return this.FaceAppendData;
//    }
//
//    public void setFaceAppendData(FaceAppendData FaceAppendData) {
//        this.FaceAppendData = FaceAppendData;
//    }
//
//    public FDSearchDescription FDSearchDescription;
//
//    public FDSearchDescription getFDSearchDescription() {
//        return this.FDSearchDescription;
//    }
//
//    public FDSearchDescription setFDSearchDescription(FDSearchDescription FDSearchDescription) {
//        this.FDSearchDescription = FDSearchDescription;
//    }
//
//    public String isSuportAnalysisFace;
//
//    public String getIsSuportAnalysisFace() {
//        return this.isSuportAnalysisFace;
//    }
//
//    public String setIsSuportAnalysisFace(String isSuportAnalysisFace) {
//        this.isSuportAnalysisFace = isSuportAnalysisFace;
//    }
//
//    public String isSuportFCSearch;
//
//    public String getIsSuportFCSearch() {
//        return this.isSuportFCSearch;
//    }
//
//    public String setIsSuportFCSearch(String isSuportFCSearch) {
//        this.isSuportFCSearch = isSuportFCSearch;
//    }
//
//    public String isSupportFDLibEachImport;
//
//    public String getIsSupportFDLibEachImport() {
//        return this.isSupportFDLibEachImport;
//    }
//
//    public String setIsSupportFDLibEachImport(String isSupportFDLibEachImport) {
//        this.isSupportFDLibEachImport = isSupportFDLibEachImport;
//    }
//
//    public FCSearchDescription FCSearchDescription;
//
//    public FCSearchDescription getFCSearchDescription() {
//        return this.FCSearchDescription;
//    }
//
//    public FCSearchDescription setFCSearchDescription(FCSearchDescription FCSearchDescription) {
//        this.FCSearchDescription = FCSearchDescription;
//    }
//
//    public String isSupportFCSearchDataPackage;
//
//    public String getIsSupportFCSearchDataPackage() {
//        return this.isSupportFCSearchDataPackage;
//    }
//
//    public String setIsSupportFCSearchDataPackage(String isSupportFCSearchDataPackage) {
//        this.isSupportFCSearchDataPackage = isSupportFCSearchDataPackage;
//    }
//
//    public String maxFCSearchDataPackageNum;
//
//    public String getMaxFCSearchDataPackageNum() {
//        return this.maxFCSearchDataPackageNum;
//    }
//
//    public String setMaxFCSearchDataPackageNum(String maxFCSearchDataPackageNum) {
//        this.maxFCSearchDataPackageNum = maxFCSearchDataPackageNum;
//    }
//
//    public String isSupportStandardSearch;
//
//    public String getIsSupportStandardSearch() {
//        return this.isSupportStandardSearch;
//    }
//
//    public String setIsSupportStandardSearch(String isSupportStandardSearch) {
//        this.isSupportStandardSearch = isSupportStandardSearch;
//    }
//
//    public String isSupportFaceDataExport;
//
//    public String getIsSupportFaceDataExport() {
//        return this.isSupportFaceDataExport;
//    }
//
//    public String setIsSupportFaceDataExport(String isSupportFaceDataExport) {
//        this.isSupportFaceDataExport = isSupportFaceDataExport;
//    }
//
//    public String isSupportNewlyPictureUpload;
//
//    public String getIsSupportNewlyPictureUpload() {
//        return this.isSupportNewlyPictureUpload;
//    }
//
//    public String setIsSupportNewlyPictureUpload(String isSupportNewlyPictureUpload) {
//        this.isSupportNewlyPictureUpload = isSupportNewlyPictureUpload;
//    }
//
//    public String isSupportFCSearchNormal;
//
//    public String getIsSupportFCSearchNormal() {
//        return this.isSupportFCSearchNormal;
//    }
//
//    public String setIsSupportFCSearchNormal(String isSupportFCSearchNormal) {
//        this.isSupportFCSearchNormal = isSupportFCSearchNormal;
//    }
//
//    public String isSupportPrompt;
//
//    public String getIsSupportPrompt() {
//        return this.isSupportPrompt;
//    }
//
//    public String setIsSupportPrompt(String isSupportPrompt) {
//        this.isSupportPrompt = isSupportPrompt;
//    }
//
//    public String isSupportFCSearchJsonFormat;
//
//    public String getIsSupportFCSearchJsonFormat() {
//        return this.isSupportFCSearchJsonFormat;
//    }
//
//    public String setIsSupportFCSearchJsonFormat(String isSupportFCSearchJsonFormat) {
//        this.isSupportFCSearchJsonFormat = isSupportFCSearchJsonFormat;
//    }
//
//    public String isSupportFCSearchDataPackageJsonFormat;
//
//    public String getIsSupportFCSearchDataPackageJsonFormat() {
//        return this.isSupportFCSearchDataPackageJsonFormat;
//    }
//
//    public String setIsSupportFCSearchDataPackageJsonFormat(String isSupportFCSearchDataPackageJsonFormat) {
//        this.isSupportFCSearchDataPackageJsonFormat = isSupportFCSearchDataPackageJsonFormat;
//    }
//
//    public String isSupportManualModeling;
//
//    public String getIsSupportManualModeling() {
//        return this.isSupportManualModeling;
//    }
//
//    public String setIsSupportManualModeling(String isSupportManualModeling) {
//        this.isSupportManualModeling = isSupportManualModeling;
//    }
//
//    public String isSupportModelingStatusSearch;
//
//    public String getIsSupportModelingStatusSearch() {
//        return this.isSupportModelingStatusSearch;
//    }
//
//    public String setIsSupportModelingStatusSearch(String isSupportModelingStatusSearch) {
//        this.isSupportModelingStatusSearch = isSupportModelingStatusSearch;
//    }
//
//    public int isSupportCustomHumanID;
//
//    public int getIsSupportCustomHumanID() {
//        return this.isSupportCustomHumanID;
//    }
//
//    public int setIsSupportCustomHumanID(int isSupportCustomHumanID) {
//        this.isSupportCustomHumanID = isSupportCustomHumanID;
//    }
//
//    public int isSupportCustomFaceLibID;
//
//    public int getIsSupportCustomFaceLibID() {
//        return this.isSupportCustomFaceLibID;
//    }
//
//    public int setIsSupportCustomFaceLibID(int isSupportCustomFaceLibID) {
//        this.isSupportCustomFaceLibID = isSupportCustomFaceLibID;
//    }
//
//    public String isSupportFDCapacity;
//
//    public String getIsSupportFDCapacity() {
//        return this.isSupportFDCapacity;
//    }
//
//    public String setIsSupportFDCapacity(String isSupportFDCapacity) {
//        this.isSupportFDCapacity = isSupportFDCapacity;
//    }
//
//    public SupportUploadPictureType SupportUploadPictureType;
//
//    public SupportUploadPictureType getSupportUploadPictureType() {
//        return this.SupportUploadPictureType;
//    }
//
//    public SupportUploadPictureType setSupportUploadPictureType(SupportUploadPictureType SupportUploadPictureType) {
//        this.SupportUploadPictureType = SupportUploadPictureType;
//    }
//}
//
//public class CreateFDLibList {
//
//    public String size;
//
//    public String getSize() {
//        return this.size;
//    }
//
//    public String setSize(String size) {
//        this.size = size;
//    }
//
//    public CreateFDLib CreateFDLib;
//
//    public CreateFDLib getCreateFDLib() {
//        return this.CreateFDLib;
//    }
//
//    public CreateFDLib setCreateFDLib(CreateFDLib CreateFDLib) {
//        this.CreateFDLib = CreateFDLib;
//    }
//}
//
//public class CreateFDLib {
//
//    public int id;
//
//    public int getId() {
//        return this.id;
//    }
//
//    public int setId(int id) {
//        this.id = id;
//    }
//
//    public name name;
//
//    public name getName() {
//        return this.name;
//    }
//
//    public name setName(name name) {
//        this.name = name;
//    }
//
//    public faceDataMax faceDataMax;
//
//    public faceDataMax getFaceDataMax() {
//        return this.faceDataMax;
//    }
//
//    public faceDataMax setFaceDataMax(faceDataMax faceDataMax) {
//        this.faceDataMax = faceDataMax;
//    }
//
//    public int customFaceLibID;
//
//    public int getCustomFaceLibID() {
//        return this.customFaceLibID;
//    }
//
//    public int setCustomFaceLibID(int customFaceLibID) {
//        this.customFaceLibID = customFaceLibID;
//    }
//
//    public indentityKey indentityKey;
//
//    public indentityKey getIndentityKey() {
//        return this.indentityKey;
//    }
//
//    public indentityKey setIndentityKey(indentityKey indentityKey) {
//        this.indentityKey = indentityKey;
//    }
//}
//
//public class id {
//
//    public String min;
//
//    public String getMin() {
//        return this.min;
//    }
//
//    public String setMin(String min) {
//        this.min = min;
//    }
//
//    public String max;
//
//    public String getMax() {
//        return this.max;
//    }
//
//    public String setMax(String max) {
//        this.max = max;
//    }
//}
//
//public class name {
//
//    public String min;
//
//    public String getMin() {
//        return this.min;
//    }
//
//    public String setMin(String min) {
//        this.min = min;
//    }
//
//    public String max;
//
//    public String getMax() {
//        return this.max;
//    }
//
//    public String setMax(String max) {
//        this.max = max;
//    }
//}
//
//public class faceDataMax {
//
//    public String min;
//
//    public String getMin() {
//        return this.min;
//    }
//
//    public String setMin(String min) {
//        this.min = min;
//    }
//
//    public String max;
//
//    public String getMax() {
//        return this.max;
//    }
//
//    public String setMax(String max) {
//        this.max = max;
//    }
//}
//
//public class customFaceLibID {
//
//    public String min;
//
//    public String getMin() {
//        return this.min;
//    }
//
//    public String setMin(String min) {
//        this.min = min;
//    }
//
//    public String max;
//
//    public String getMax() {
//        return this.max;
//    }
//
//    public String setMax(String max) {
//        this.max = max;
//    }
//}
//
//public class indentityKey {
//
//    public String min;
//
//    public String getMin() {
//        return this.min;
//    }
//
//    public String setMin(String min) {
//        this.min = min;
//    }
//
//    public String max;
//
//    public String getMax() {
//        return this.max;
//    }
//
//    public String setMax(String max) {
//        this.max = max;
//    }
//}
//
//public class FaceAppendData {
//
//    public String bornTime;
//
//    public String getBornTime() {
//        return this.bornTime;
//    }
//
//    public String setBornTime(String bornTime) {
//        this.bornTime = bornTime;
//    }
//
//    public name name;
//
//    public name getName() {
//        return this.name;
//    }
//
//    public name setName(name name) {
//        this.name = name;
//    }
//
//    public sex sex;
//
//    public sex getSex() {
//        return this.sex;
//    }
//
//    public sex setSex(sex sex) {
//        this.sex = sex;
//    }
//
//    public String province;
//
//    public String getProvince() {
//        return this.province;
//    }
//
//    public String setProvince(String province) {
//        this.province = province;
//    }
//
//    public String city;
//
//    public String getCity() {
//        return this.city;
//    }
//
//    public String setCity(String city) {
//        this.city = city;
//    }
//
//    public certificateType certificateType;
//
//    public certificateType getCertificateType() {
//        return this.certificateType;
//    }
//
//    public certificateType setCertificateType(certificateType certificateType) {
//        this.certificateType = certificateType;
//    }
//
//    public certificateNumber certificateNumber;
//
//    public certificateNumber getCertificateNumber() {
//        return this.certificateNumber;
//    }
//
//    public certificateNumber setCertificateNumber(certificateNumber certificateNumber) {
//        this.certificateNumber = certificateNumber;
//    }
//
//    public PersonInfoExtendList PersonInfoExtendList;
//
//    public PersonInfoExtendList getPersonInfoExtendList() {
//        return this.PersonInfoExtendList;
//    }
//
//    public PersonInfoExtendList setPersonInfoExtendList(PersonInfoExtendList PersonInfoExtendList) {
//        this.PersonInfoExtendList = PersonInfoExtendList;
//    }
//
//    public String isSupportPhoneNumber;
//
//    public String getIsSupportPhoneNumber() {
//        return this.isSupportPhoneNumber;
//    }
//
//    public String setIsSupportPhoneNumber(String isSupportPhoneNumber) {
//        this.isSupportPhoneNumber = isSupportPhoneNumber;
//    }
//
//    public int customHumanID;
//
//    public int getCustomHumanID() {
//        return this.customHumanID;
//    }
//
//    public int setCustomHumanID(int customHumanID) {
//        this.customHumanID = customHumanID;
//    }
//}
//
//public class sex {
//
//    public String opt;
//
//    public String getOpt() {
//        return this.opt;
//    }
//
//    public String setOpt(String opt) {
//        this.opt = opt;
//    }
//}
//
//public class certificateType {
//
//    public String opt;
//
//    public String getOpt() {
//        return this.opt;
//    }
//
//    public String setOpt(String opt) {
//        this.opt = opt;
//    }
//}
//
//public class certificateNumber {
//
//    public String min;
//
//    public String getMin() {
//        return this.min;
//    }
//
//    public String setMin(String min) {
//        this.min = min;
//    }
//
//    public String max;
//
//    public String getMax() {
//        return this.max;
//    }
//
//    public String setMax(String max) {
//        this.max = max;
//    }
//}
//
//public class PersonInfoExtendList {
//
//    public String size;
//
//    public String getSize() {
//        return this.size;
//    }
//
//    public String setSize(String size) {
//        this.size = size;
//    }
//}
//
//public class customHumanID {
//
//    public String min;
//
//    public String getMin() {
//        return this.min;
//    }
//
//    public String setMin(String min) {
//        this.min = min;
//    }
//
//    public String max;
//
//    public String getMax() {
//        return this.max;
//    }
//
//    public String setMax(String max) {
//        this.max = max;
//    }
//}
//
//public class FDSearchDescription {
//
//    public int FDID;
//
//    public int getFDID() {
//        return this.FDID;
//    }
//
//    public int setFDID(int FDID) {
//        this.FDID = FDID;
//    }
//
//    public String startTime;
//
//    public String getStartTime() {
//        return this.startTime;
//    }
//
//    public String setStartTime(String startTime) {
//        this.startTime = startTime;
//    }
//
//    public String endTime;
//
//    public String getEndTime() {
//        return this.endTime;
//    }
//
//    public String setEndTime(String endTime) {
//        this.endTime = endTime;
//    }
//
//    public name name;
//
//    public name getName() {
//        return this.name;
//    }
//
//    public name setName(name name) {
//        this.name = name;
//    }
//
//    public sex sex;
//
//    public sex getSex() {
//        return this.sex;
//    }
//
//    public sex setSex(sex sex) {
//        this.sex = sex;
//    }
//
//    public String province;
//
//    public String getProvince() {
//        return this.province;
//    }
//
//    public String setProvince(String province) {
//        this.province = province;
//    }
//
//    public String city;
//
//    public String getCity() {
//        return this.city;
//    }
//
//    public String setCity(String city) {
//        this.city = city;
//    }
//
//    public certificateType certificateType;
//
//    public certificateType getCertificateType() {
//        return this.certificateType;
//    }
//
//    public certificateType setCertificateType(certificateType certificateType) {
//        this.certificateType = certificateType;
//    }
//
//    public certificateNumber certificateNumber;
//
//    public certificateNumber getCertificateNumber() {
//        return this.certificateNumber;
//    }
//
//    public certificateNumber setCertificateNumber(certificateNumber certificateNumber) {
//        this.certificateNumber = certificateNumber;
//    }
//
//    public FaceModeCap FaceModeCap;
//
//    public FaceModeCap getFaceModeCap() {
//        return this.FaceModeCap;
//    }
//
//    public FaceModeCap setFaceModeCap(FaceModeCap FaceModeCap) {
//        this.FaceModeCap = FaceModeCap;
//    }
//
//    public modelStatus modelStatus;
//
//    public modelStatus getModelStatus() {
//        return this.modelStatus;
//    }
//
//    public modelStatus setModelStatus(modelStatus modelStatus) {
//        this.modelStatus = modelStatus;
//    }
//
//    public modelingStatus modelingStatus;
//
//    public modelingStatus getModelingStatus() {
//        return this.modelingStatus;
//    }
//
//    public modelingStatus setModelingStatus(modelingStatus modelingStatus) {
//        this.modelingStatus = modelingStatus;
//    }
//
//    public int customFaceLibID;
//
//    public int getCustomFaceLibID() {
//        return this.customFaceLibID;
//    }
//
//    public int setCustomFaceLibID(int customFaceLibID) {
//        this.customFaceLibID = customFaceLibID;
//    }
//
//    public indentityKey indentityKey;
//
//    public indentityKey getIndentityKey() {
//        return this.indentityKey;
//    }
//
//    public indentityKey setIndentityKey(indentityKey indentityKey) {
//        this.indentityKey = indentityKey;
//    }
//}
//
//public class FaceModeCap {
//
//    public FaceMode FaceMode;
//
//    public FaceMode getFaceMode() {
//        return this.FaceMode;
//    }
//
//    public FaceMode setFaceMode(FaceMode FaceMode) {
//        this.FaceMode = FaceMode;
//    }
//}
//
//public class FaceMode {
//
//    public similarity similarity;
//
//    public similarity getSimilarity() {
//        return this.similarity;
//    }
//
//    public similarity setSimilarity(similarity similarity) {
//        this.similarity = similarity;
//    }
//}
//
//public class similarity {
//
//    public String min;
//
//    public String getMin() {
//        return this.min;
//    }
//
//    public String setMin(String min) {
//        this.min = min;
//    }
//
//    public String max;
//
//    public String getMax() {
//        return this.max;
//    }
//
//    public String setMax(String max) {
//        this.max = max;
//    }
//}
//
//public class modelStatus {
//
//    public String opt;
//
//    public String getOpt() {
//        return this.opt;
//    }
//
//    public String setOpt(String opt) {
//        this.opt = opt;
//    }
//}
//
//public class modelingStatus {
//
//    public String opt;
//
//    public String getOpt() {
//        return this.opt;
//    }
//
//    public String setOpt(String opt) {
//        this.opt = opt;
//    }
//}
//
//public class FCSearchDescription {
//
//    public String snapStartTime;
//
//    public String getSnapStartTime() {
//        return this.snapStartTime;
//    }
//
//    public String setSnapStartTime(String snapStartTime) {
//        this.snapStartTime = snapStartTime;
//    }
//
//    public String snapEndTime;
//
//    public String getSnapEndTime() {
//        return this.snapEndTime;
//    }
//
//    public String setSnapEndTime(String snapEndTime) {
//        this.snapEndTime = snapEndTime;
//    }
//
//    public eventType eventType;
//
//    public eventType getEventType() {
//        return this.eventType;
//    }
//
//    public eventType setEventType(eventType eventType) {
//        this.eventType = eventType;
//    }
//
//    public FaceModeCap FaceModeCap;
//
//    public FaceModeCap getFaceModeCap() {
//        return this.FaceModeCap;
//    }
//
//    public FaceModeCap setFaceModeCap(FaceModeCap FaceModeCap) {
//        this.FaceModeCap = FaceModeCap;
//    }
//
//    public PictureSearchCap PictureSearchCap;
//
//    public PictureSearchCap getPictureSearchCap() {
//        return this.PictureSearchCap;
//    }
//
//    public PictureSearchCap setPictureSearchCap(PictureSearchCap PictureSearchCap) {
//        this.PictureSearchCap = PictureSearchCap;
//    }
//
//    public String isSupportMultiChannelSearch;
//
//    public String getIsSupportMultiChannelSearch() {
//        return this.isSupportMultiChannelSearch;
//    }
//
//    public String setIsSupportMultiChannelSearch(String isSupportMultiChannelSearch) {
//        this.isSupportMultiChannelSearch = isSupportMultiChannelSearch;
//    }
//
//    public String isSupportTotalSearchResult;
//
//    public String getIsSupportTotalSearchResult() {
//        return this.isSupportTotalSearchResult;
//    }
//
//    public String setIsSupportTotalSearchResult(String isSupportTotalSearchResult) {
//        this.isSupportTotalSearchResult = isSupportTotalSearchResult;
//    }
//}
//
//public class eventType {
//
//    public String opt;
//
//    public String getOpt() {
//        return this.opt;
//    }
//
//    public String setOpt(String opt) {
//        this.opt = opt;
//    }
//}
//
//public class PictureSearchCap {
//
//    public maxSearchPictureNum maxSearchPictureNum;
//
//    public maxSearchPictureNum getMaxSearchPictureNum() {
//        return this.maxSearchPictureNum;
//    }
//
//    public maxSearchPictureNum setMaxSearchPictureNum(maxSearchPictureNum maxSearchPictureNum) {
//        this.maxSearchPictureNum = maxSearchPictureNum;
//    }
//}
//
//public class maxSearchPictureNum {
//
//    public String min;
//
//    public String getMin() {
//        return this.min;
//    }
//
//    public String setMin(String min) {
//        this.min = min;
//    }
//
//    public String max;
//
//    public String getMax() {
//        return this.max;
//    }
//
//    public String setMax(String max) {
//        this.max = max;
//    }
//}
//
//public class SupportUploadPictureType {
//
//    public String opt;
//
//    public String getOpt() {
//        return this.opt;
//    }
//
//    public String setOpt(String opt) {
//        this.opt = opt;
//    }
//}
