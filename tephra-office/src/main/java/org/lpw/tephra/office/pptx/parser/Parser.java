package org.lpw.tephra.office.pptx.parser;

import com.alibaba.fastjson.JSONObject;
import org.apache.poi.xslf.usermodel.XSLFGraphicFrame;
import org.apache.poi.xslf.usermodel.XSLFSimpleShape;
import org.lpw.tephra.office.pptx.MediaWriter;

/**
 * 解析器。
 *
 * @author lpw
 */
public interface Parser {
    /**
     * 解析数据。
     *
     * @param xslfSimpleShape 形状。
     * @param mediaWriter     媒体资源输出器。
     * @param shape           解析数据。
     * @param layout          是否为模板形状。
     */
    void parse(XSLFSimpleShape xslfSimpleShape, MediaWriter mediaWriter, JSONObject shape, boolean layout);

    /**
     * 解析数据。
     *
     * @param xslfGraphicFrame 形状。
     * @param mediaWriter      媒体资源输出器。
     * @param shape            解析数据。
     */
    void parse(XSLFGraphicFrame xslfGraphicFrame, MediaWriter mediaWriter, JSONObject shape);
}