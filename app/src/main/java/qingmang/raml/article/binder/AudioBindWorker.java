package qingmang.raml.article.binder;

import android.view.View;


import qingmang.raml.R;
import qingmang.raml.article.model.HElement;
import qingmang.raml.article.model.HMedia;
import qingmang.raml.ui.controller.ImageController;

/**
 * @author yangfan@wandoujia.com (Yang Fan)
 */
public class AudioBindWorker extends ArticleBindWorker {
  @Override
  public void bind(View view, HElement model) {
    HMedia media = model.media;
    if (media != null) {
      new ImageController(media.cover).bind(view(R.id.cover));
      // TODO
      // new AudioController(media.source, media.cover, media.title).bind(view);
    }
  }

  @Override
  public void unbind(View view) {

  }
}
